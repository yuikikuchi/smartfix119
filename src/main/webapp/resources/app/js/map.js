//ピンの表示
function initMap() {
	// Google Map 初期化
	var map = new google.maps.Map(document.getElementById('map'), {
		zoom: 12,
		gestureHandling: 'greedy', //PC：スクロールでズーム  モバイル：指1本のスクロールで地図移動
		mapTypeControl: false, //マップタイプ コントロール
		fullscreenControl: true, //全画面表示コントロール
		streetViewControl: true, //ストリートビュー コントロール
		zoomControl: true, //ズーム コントロール
		center: new google.maps.LatLng(36.3631066, 134.5696014), //MAP初期値
		mapTypeId: google.maps.MapTypeId.ROADMAP
	});

	var infowindow = new google.maps.InfoWindow;
	var marker;

	// 非同期通信 JSON取得
	fetch('getJSON')
	.then((response) => response.json())
	.then(data => {
		data.forEach(function(data, index) {

			// MAP緯度経度初期値
			latlng = new google.maps.LatLng(data.lat, data.lng);
			map.setCenter(latlng);

			index = index + 1;
			marker = new google.maps.Marker({
				position: new google.maps.LatLng(data.lat, data.lng),
				map: map,
				icon: document.getElementById("photo" + index).src
			});
			//マーカーとイメージアイコンのリンク付け
			addClickListener(marker, "shopNo" + (index));
			google.maps.event.addListener(marker, 'click', (function (marker, index) {
				return function () {
					infowindow.setContent(data.html);
					infowindow.open(map, marker);
				}
			})(marker, index));
		})
	})
	.catch((error) => console.log(error));

	// 情報の初期表示は非表示
	document.getElementById("target").style.display = "none";

	//ピンがクリックされたら情報が開く
	function OnLinkClick() {
		const target = document.getElementById("target");

		if (target.style.display == "block") {
			// noneで非表示
			target.style.display = "none";
		} else {
			// blockで表示
			target.style.display = "block";
		}
	}

	// 店舗名とマーカーの紐づけ
	function addClickListener(marker, shopNo) {
		var shopName = document.getElementById(shopNo);
		//アイコンがクリックされたら、マーカーを擬似クリックしたことにする
		google.maps.event.addDomListener(shopName, "click", function () {
			google.maps.event.trigger(marker, "click");
			//アイコンがクリックされたときの処理
			placeMarker(marker.position);
		});
	}
}
