<main>
<section class="section_box_top">
  <div class="breadcrumbs">
    <a href="<%= request.getContextPath() %>/#search_section">検索</a>
    <a class="active">${f:h(areaList.area2Name)}</a>
  </div>
  <hr>
    <h2><b>${f:h(areaList.area2Name)} エリア</b></h2>
  
  <div>
    <p>※新型コロナウイルス（COVID-19）の影響により営業時間やサービス内容が異なる場合があります。</p>
    <p>修理料金や修理時間については必ず各店舗のHPをご確認の上、各店舗への問い合わせをお願いいたします。</p>
  </div>
  
  <div class="mymap">
    <iframe class="smartfix119_map" src="${f:h(areaList.map)}"></iframe>
  </div>
  
  <hr>
  
  <div class="cssgrid">
    <c:forEach var="shopList" varStatus="s" items="${page.content}">
    <div>
      <div class="card_contents">
      <div class="card open_flg">
        <div class="i2 shop_card back" onclick="gtag('event', '店舗カードタップ', {'event_category': '店舗カードタップ', 'event_label': '${f:h(shopList.shopName)}'});">
          <div class="image-box">
            <iframe src="${f:h(shopList.map)}"></iframe>
          </div>
          <div class="desc-box">
            <p class="desc2">${f:h(shopList.location1)}<br></p>
            <p class="desc2">${f:h(shopList.location2)}<br></p>
            <a class="btn card_btn" href="${f:h(shopList.shopSite)}" onclick="gtag('event', 'READ MORE', {'event_category': 'HPクリック', 'event_label': '${f:h(shopList.shopName)}'});" role="button">Read More</a>
          </div>
        </div>
        <div class="i1 shop_card front" onclick="gtag('event', '店舗カードタップ', {'event_category': '店舗カードタップ', 'event_label': '${f:h(shopList.shopName)}'});">
          <!-- <div class="image-box"><img src="https://picsum.photos/500/300/?image=10"></div> -->
          <div class="image-box"><img src="${pageContext.request.contextPath}/resources/app/img/shopcard_image.JPG"></div>
          <div class="title-box">
            <h1 class="title">${f:h(shopList.shopName)}</h1>
          </div>
          <div class="line"></div>
          <div class="desc-box">
            <p class="desc1">【店舗紹介】<br><!-- 100文字 -->
            </p>
            <p class="desc2">
                                 営業時間：${f:h(shopList.businessHour1)}<br>
                                電話番号：<a href="tel:${f:h(shopList.phoneNo1)}" onClick="gtag('event', '電話番号', {'event_category': '番号タップ', 'event_label': '${f:h(shopList.shopName)}', 'value': '0'});">${f:h(shopList.phoneNo1)}</a><br>
                                定休日　：${f:h(shopList.holidays)}</p>
          </div>
        </div>
      </div>
      </div>
      </div>
    </c:forEach>
  </div>

  <t:pagination criteriaQuery="area=${f:h(areaList.area2Name2)}" 
  page="${page}" 
  outerElementClass="pagination" 
  maxDisplayCount="0" 
  previousLinkText="Prev" 
  nextLinkText="Next" />
  
  <div class="totalPages">
    ${f:h(page.number + 1) } / 
    ${f:h(page.totalPages)} Pages
  </div>

</section>
<hr>
</main>
