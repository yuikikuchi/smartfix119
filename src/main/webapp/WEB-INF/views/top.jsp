<main>
  <!-- TOP SECTION -->
  <section>
    <div class="top_page">
      <div class="topimage">
        <h1>スマホの故障</br>修理店を探すなら</br>SmartFix119</h1>
        <img src="${pageContext.request.contextPath}/resources/app/img/crown.png" alt="crown">
        <p>掲載店舗数</p>	
      </div> 
    </div>
  </section>

  <!-- OVERVIEW SECTION -->
  <section id="home_section" class="fdb-block section_box_top">
    <div class="container">
      <div class="row text-right align-items-center">
        <div class="col-7 col-md-4 m-auto">
          <p><img alt="image" class="img-fluid" src="https://cdn.jsdelivr.net/gh/froala/design-blocks@master/dist/imgs//draws/simple-iphone.svg"></p>
        </div>
        <div class="col-12 col-md-7 col-lg-5 m-auto text-left pt-5 pt-md-0">
          <div class="row pb-lg-5">
          <div class="col-3">
          <!-- <a class="android"></a> -->
          <img alt="image" class="img-fluid store_icon" src="${pageContext.request.contextPath}/resources/app/img/overview_01.svg">
          </div>
          <div class="col-9">
            <h2><b>全国の修理店舗を掲載</b></h2>
            <p>国内約2000店舗の携帯・スマホ修理店を掲載！！</p>
          </div>
        </div>
        
        <div class="row pt-4 pt-md-5 pb-lg-5">
          <div class="col-3">
            <img alt="image" class="img-fluid device_icon" src="${pageContext.request.contextPath}/resources/app/img/overview_02.svg">
          </div>
          <div class="col-9">
            <h2><b>あらゆるモバイル端末に対応</b></h2>
            <p>iPhone、Androidスマホのみならず、各種タブレット、ガラケー修理まで行える店舗も掲載！</p>
          </div>
        </div>
        
        <div class="row pt-4 pt-md-5">
            <div class="col-3">
              <img alt="image" class="img-fluid build_icon" src="${pageContext.request.contextPath}/resources/app/img/overview_03.svg">
            </div>
            <div class="col-9">
              <h2><b>即日修理店多数</b></h2>
              <p>即日修理から郵送修理、まであらゆるニーズに対応できる店舗を掲載！</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>

<hr>

<!-- ABOUT SECTION -->
<section id="about_section" class="fdb-block section_box" data-block-type="contents" data-id="5" draggable="true">
  <div class="container">
    <div class="row align-items-center">
      <div class="col-12 col-md-12 col-lg-6 col-xl-5">
        <h2><b>ABOUT</b></h2>
        <p><b>SmartFix119について</b></p>
        <p class="lead mb-5">
          SmartFix119は日本全国のスマホ、タブレット等のモバイル端末修理店舗を掲載するキュレーションメディアです。</br>
                       総務省認定のスマホ修理業者から、各メーカー認定の修理店舗まで、あらゆる修理店舗を掲載しています。</br>
                       即日修理可能な店舗から、郵送修理専門のお店まであらゆるニーズに対応！</br>
                       あなたに最適なお店がきっと見つかるはずです。
        </p>
      </div>
      <div class="col-12 col-md-8 m-auto ml-lg-auto mr-lg-0 col-lg-6 pt-5 pt-lg-0">
        <p><img alt="image" class="img-fluid" src="${pageContext.request.contextPath}/resources/app/img/about_us.svg"></p>
      </div>
    </div>
  </div>
</section>

<hr>

<!-- PICKUP SECTION -->
<section id="pickup_section" class="section_box">
  <h2><b>Pickup Shop</b></h2>
  <div class="cssgrid">
    <c:forEach var="shopList" varStatus="s" items="${shopList}">
    <div>
      <div class="card_contents">
      <div class="card open_flg">
        <div class="i2 shop_card back" onclick="gtag('event', '店舗カードタップ', {'event_category': '店舗カードタップ', 'event_label': '${f:h(shopList.shopName)}'});">
          <div class="image-box">
            <iframe src="${f:h(shopList.map)}"></iframe>
          </div>
          <div class="desc-box">
            <p class="desc2">${f:h(shopList.location01)}<br></p>
              <table class="shop_detail" border="1" bordercolor="#90A4AE">
               <tr>
                 <th>アクセス</th>
                 <td>${f:h(shopList.location02)}</td>
                </tr>
                <tr>
                 <th>営業時間</th>
                 <td>${f:h(shopList.businessHour01)}</td>
                </tr>
                <tr>
                 <th>電話番号</th>
                 <td><a href="tel:${f:h(shopList.phoneNo01)}" onClick="gtag('event', '電話番号', {'event_category': '番号タップ', 'event_label': '${f:h(shopList.shopName)}', 'value': '0'});">${f:h(shopList.phoneNo01)}</a></td>
                </tr>
                <tr>
                 <th>定休日</th>
                 <td>${f:h(shopList.holidays)}</td>
                </tr>
              </table>
            <a class="btn card_btn" href="${f:h(shopList.shopSite)}" onclick="gtag('event', 'READ MORE', {'event_category': 'HPクリック', 'event_label': '${f:h(shopList.shopName)}'});" role="button">Read More</a>
          </div>
        </div>
        <div class="i1 shop_card front" onclick="gtag('event', '店舗カードタップ', {'event_category': '店舗カードタップ', 'event_label': '${f:h(shopList.shopName)}'});">
          <!-- <div class="image-box"><img src="https://picsum.photos/500/300/?image=10"></div> -->
          <div class="image-box"><img src="${pageContext.request.contextPath}/resources/app/img/shop/quickrepairplus_image.png"></div>
          <div class="title-box">
            <h1 class="title">${f:h(shopList.shopName)}</h1>
          </div>
          <div class="line"></div>
          <div class="desc-box">
            <p class="desc1">【店舗紹介】<br><!-- 100文字 -->
            ${f:h(shopList.introduction)}
            </p>
              <c:set var="officialFlg" value="${f:h(shopList.officialFlg)}" />
              <c:if test="${officialFlg == '1'}">
                <div class="shop_tag"><p>総務省認定</p></div>
              </c:if>
              <c:set var="appleFlg" value="${f:h(shopList.appleFlg)}" />
              <c:if test="${appleFlg == '1'}">
                <div class="shop_tag"><p>Apple</p></div>
              </c:if>
              <c:set var="androidFlg" value="${f:h(shopList.androidFlg)}" />
              <c:if test="${androidFlg == '1'}">
                <div class="shop_tag"><p>Android</p></div>
              </c:if>
              <div></div>
              <a class="js-modal-open charge" href="">修理料金</a>
          </div>
        </div>
      </div>
      </div>
      </div>
    </c:forEach>
  </div>
</section>

<!-- <hr> -->

<!-- SEARCH SECTION -->
  <section id="search_section" class="section_box search_section_img">
    <h2><b>Search by Area</b></h2>
    <div class="slider">
      <ul class="my-menu area_menu clearfix">
        <li><a href="#">北海道・東北</a>
          <ul class="area_menu clearfix">
            <li><a href="<c:url value="/search"><c:param name="area" value="hokkaido" /></c:url>">北海道</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="aomori" /></c:url>">青森県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="iwate" /></c:url>">岩手県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="miyagi" /></c:url>">宮城県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="akita" /></c:url>">秋田県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="yamagata" /></c:url>">山形県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="fukushima" /></c:url>">福島県</a>
          </ul>
        <li><a href="#">関東</a>
          <ul class="area_menu clearfix">
            <li><a href="<c:url value="/search"><c:param name="area" value="ibaraki" /></c:url>">茨城県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="tochigi" /></c:url>">栃木県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="gunma" /></c:url>">群馬県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="saitama" /></c:url>">埼玉県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="chiba" /></c:url>">千葉県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="tokyo" /></c:url>">東京都</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="kanagawa" /></c:url>">神奈川県</a>
          </ul>
        <li><a href="#">北陸・甲信越</a>
          <ul class="area_menu">
            <li><a href="<c:url value="/search"><c:param name="area" value="niigata" /></c:url>">新潟県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="toyama" /></c:url>">富山県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="ishikawa" /></c:url>">石川県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="fukui" /></c:url>">福井県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="yamanashi" /></c:url>">山梨県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="nagano" /></c:url>">長野県</a>
          </ul>
        <li><a href="#">東海</a>
          <ul class="area_menu">
            <li><a href="<c:url value="/search"><c:param name="area" value="gifu" /></c:url>">岐阜県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="shizuoka" /></c:url>">静岡県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="aichi" /></c:url>">愛知県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="mie" /></c:url>">三重県</a>
          </ul>
        <li><a href="#">近畿</a>
          <ul class="area_menu clearfix">
            <li><a href="<c:url value="/search"><c:param name="area" value="shiga" /></c:url>">滋賀県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="kyoto" /></c:url>">京都府</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="osaka" /></c:url>">大阪府</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="hyogo" /></c:url>">兵庫県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="nara" /></c:url>">奈良県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="wakayama" /></c:url>">和歌山県</a>
          </ul>
        <li><a href="#">中国・四国</a>
          <ul class="area_menu">
            <li><a href="<c:url value="/search"><c:param name="area" value="tottori" /></c:url>">鳥取県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="shimane" /></c:url>">島根県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="okayama" /></c:url>">岡山県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="hiroshima" /></c:url>">広島県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="yamaguchi" /></c:url>">山口県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="tokushima" /></c:url>">徳島県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="kagawa" /></c:url>">香川県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="ehime" /></c:url>">愛媛県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="kochi" /></c:url>">高知県</a>
          </ul>
        <li><a href="#">九州</a>
          <ul class="area_menu">
            <li><a href="<c:url value="/search"><c:param name="area" value="fukuoka" /></c:url>">福岡県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="saga" /></c:url>">佐賀県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="nagasaki" /></c:url>">長崎県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="kumamoto" /></c:url>">熊本県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="oita" /></c:url>">大分県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="miyazaki" /></c:url>">宮崎県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="kagoshima" /></c:url>">鹿児島県</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="okinawa" /></c:url>">沖縄県</a>
          </ul>
        <li><a href="#">その他</a>
          <ul class=" area_menu">
            <li><a href="<c:url value="/search"><c:param name="area" value="delivery" /></c:url>">郵送修理</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="usedshop" /></c:url>">スマホ販売店</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="purchaseshop" /></c:url>">スマホ買取店</a>
            <li><a href="<c:url value="/search"><c:param name="area" value="partsshop" /></c:url>">修理パーツ販売店</a>
          </ul>
      </ul>
    </div>
    <div class="mymap">
      <iframe class="smartfix119_map" src="https://www.google.com/maps/d/embed?mid=1xBEY4C05mIF1GC2jIVs9IZKZfogGHw7Y&ll=35.6961555,139.6910507&z=10&hl=ja"></iframe>
    </div>
  </section>
  
<hr>

<!-- SERVICE SECTION -->
<section id="service_section" class="section_box service_section_img">
  <h2><b>Service</b></h2>
  <div class="cssgrid">
    <div class="card">
      <div class="image-box1">
        <%-- <img src="${pageContext.request.contextPath}/resources/app/img/animate/fix_service_01.svg" alt=""> --%>
      </div>
      <div class="title-box">
        <p class="title">画面割れ 液晶割れ </p>
      </div>
      <div class="line"></div>
      <div class="desc-box">
        <p class="service_desc">画面の割れたスマホを使用し続けると、液晶破損につながり、タッチが利かなくなる可能性が高くなります。また湿気や手汗により、基板など重要部品の致命的な故障の原因になり危険です。軽度の画面割れでも修理をおすすめします。</p>
      </div>
    </div>
    <div class="card">
      <div class="image-box2"></div>
      <div class="title-box">
        <p class="title">水没･浸水修理</p>
      </div>
      <div class="line"></div>
      <div class="desc-box">
        <p class="service_desc">スマホの防水性能のはほとんどの場合、生活防止レベルになります。水没後の通電は、基板や回路の損傷原因となるため、電源は入れず、お近くの修理店舗にお持ちください。</p>
      </div>
    </div>
    <div class="card">
      <div class="image-box3"></div>
      <div class="title-box">
        <p class="title">バッテリーの交換</p>
      </div>
      <div class="line"></div>
      <div class="desc-box">
        <p class="service_desc">毎日使用するスマホはバッテリーも早い段階で寿命を迎えます。長く使用したいお気に入りのスマホは、バッテリーの交換で継続して使用できます。どの店舗でも機種によっては最短5分で交換できますので、お気軽にご相談ください。</p>
      </div>
    </div>
    <div class="card">
      <div class="image-box4"></div>
      <div class="title-box">
        <p class="title">各種ボタンの修理･交換</p>
      </div>
      <div class="line"></div>
      <div class="desc-box">
        <p class="service_desc">電源ボタンや音量ボタンは破損しやすいパーツの代表です。接触不良やボタンがとれてしまった、などのお悩みなら、ボタン部品の交換で解決します。</p>
      </div>
    </div>
    <div class="card">
      <div class="image-box5"></div>
      <div class="title-box">
        <p class="title">アンテナ･Wi-Fiの修理･交換</p>
      </div>
      <div class="line"></div>
      <div class="desc-box">
        <p class="service_desc">アンテナ・Wi-Fiの障害は突然訪れます。Wi-Fi環境なのにWi-Fi接続できない。勝手に圏外になってしまう。こんな症状はWi-Fiやアンテナパーツの故障･劣化が考えられます。たいていの場合は部品交換で治すことが可能です。</p>
      </div>
    </div>
    <div class="card">
      <div class="image-box6"></div>
      <div class="title-box">
        <p class="title">マイク･スピーカーの故障</p>
      </div>
      <div class="line"></div>
      <div class="desc-box">
        <p class="service_desc">外部スピーカーやイヤースピーカー、マイクは湿気やほこりにに弱いため、音が出なくなったり、ノイズが入ったりします。マイクやスピーカー部分の部品交換ですぐに解決します！</p>
      </div>
    </div>
    <div class="card">
      <div class="image-box7"></div>
      <div class="title-box">
        <p class="title">自己修理失敗</p>
      </div>
      <div class="line"></div>
      <div class="desc-box">
        <p class="service_desc">最近は自分でパーツを購入することも可能なため、不調なスマホを分解して直そうとしたところ、電源が入らなくなってしまったという方も…。そんな時はプロの修理業者にお任せしましょう！すぐに原因を特定して修理します！</p>
      </div>
    </div>
    <div class="card">
      <div class="image-box8"></div>
      <div class="title-box">
        <p class="title">起動しないスマホの復旧</p>
      </div>
      <div class="line"></div>
      <div class="desc-box">
        <p class="service_desc">起動しなくなったスマホも、プロの修理業者ならすぐに原因を特定してくれるはず。大切な写真や連絡先、ゲームアプリなどの保存データも諦めないでください！何をやっても起動しない端末でも諦めずに一度ご相談しましょう。</p>
      </div>
    </div>
  </div>
</section>

<hr>

<!-- NEWS SECTION -->
<section id="news_section" class="section_box">
  <h2><b>News</b></h2>
  <ul class="news">
    <c:forEach var="newsList" varStatus="s" items="${newsList}">
      <li class="news_item responsive">
        <div class="iframely-embed">
          <div class="iframely-responsive" style="height: 140px; padding-bottom: 0;">
            <a href="${f:h(newsList.script)}" data-iframely-url="${f:h(newsList.script2)}"></a>
          </div>
        </div>
        <div class="news_date">${f:h(newsList.createdAt)}</div>
        <script async src="//cdn.iframe.ly/embed.js" charset="utf-8"></script>
      </li>
    </c:forEach>
  </ul>
</section>

<hr>

<!-- MAKER SECTION -->
<%-- <section id="maker_section" class="fdb-block py-0 section_box maker_section_img" data-block-type="contents" data-id="14" draggable="true">
  <h2><b>対応機種</b></h2>
  <ul class="top-banner">
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/acer.svg" alt="acer_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/akaso.svg" alt="akaso_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/amazon.svg" alt="amazon_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/android-one.svg" alt="android-one_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/apple.svg" alt="apple_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/asus.svg" alt="asus_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/blackview.svg" alt="blackview_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/brackberry.svg" alt="brackberry_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/chuwi.svg" alt="chuwi_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/covia.svg" alt="covia_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/dell.svg" alt="dell_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/disney.svg" alt="disney_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/doogee.svg" alt="doogee_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/dynabook.svg" alt="dynabook_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/essential.svg" alt="essential_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/foxconn.svg" alt="foxconn_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/freetel.svg" alt="freetel_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/fujitsu.svg" alt="fujitsu_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/google.svg" alt="google_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/hp.svg" alt="hp_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/htc.svg" alt="htc_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/huawei.svg" alt="huawei_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/kyocera.svg" alt="kyocera_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/leagoo.svg" alt="leagoo_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/lenovo.svg" alt="lenovo_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/sharp.svg" alt="sharp_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/nec.svg" alt="nec_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/nokia.svg" alt="nokia_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/oneplus.svg" alt="oneplus_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/oppo.svg" alt="oppo_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/oukitel.svg" alt="oukitel_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/panasonic.svg" alt="panasonic_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/samsung.svg" alt="samsung_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/sharp.svg" alt="sharp_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/sony.svg" alt="sony_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/tcl.svg" alt="tcl_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/teclast.svg" alt="teclast_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/toshiba.svg" alt="toshiba_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/umidigi.svg" alt="umidigi_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/unihertz.svg" alt="unihertz_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/vaio.svg" alt="vaio_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/vankyo.svg" alt="vankyo_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/vivo.svg" alt="vivo_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/xiaomi.svg" alt="xiaomi_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/oppo.svg" alt="oppo_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/sharp.svg" alt="sharp_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/zonko.svg" alt="zonko_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/zte.svg" alt="zte_logo"></li>
    <li><img src="${pageContext.request.contextPath}/resources/app/img/maker/other.svg" alt="other_logo"></li>
  </ul>
</section> --%>

<section id="maker_section" class="fdb-block py-0 section_box maker_section_img" data-block-type="contents" data-id="14" draggable="true">
  <h2><b>スマホケース</b></h2>
  <ul class="news">
    <%-- <c:forEach var="newsList" varStatus="s" items="${newsList}"> --%>
      <li class="news_item responsive">
        <div class="iframely-embed">
          <div class="iframely-responsive" style="height: 140px; padding-bottom: 0;">
            <a href="https://smartfix119.theshop.jp/items/40361987" data-iframely-url="//cdn.iframe.ly/ovCORKR?iframe=card-small"></a>
          </div>
        </div>
        <%-- <div class="news_date">${f:h(newsList.createdAt)}</div> --%>
        <script async src="//cdn.iframe.ly/embed.js" charset="utf-8"></script>
      </li>
    <%-- </c:forEach> --%>
  </ul>
</section>

<hr>

<!-- CONTACT SECTION -->
  <section id="contact_section" class="fdb-block section_box contact_section_img" data-block-type="contacts" data-id="8" draggable="true">
    <form:form class="ContactForm" name="contactForm" id="contactForm" action="${pageContext.request.contextPath}/contact" modelAttribute="contactForm" method="POST" target="send">
    <div id="contactInfos">
      <div id="v1" class="ItemContent"><!-- 入力画面 -->
        <h2><b>お問い合わせ</b></h2>
        <table class="Tbl">
          <tbody>
            <tr>
              <td class="TxtR col-md-4">お名前<em>※</em></td>
              <td><form:input type="text" name="user_name" class="col-md-4 ChangeConfirm ImeModeActive IO form-control" data-rule="required" data-confirm="c_userName" title="お名前" path="name" /></td>
            </tr>
            <tr>
              <td class="TxtR">メールアドレス<em>※</em></td>
              <td><form:input name="email" class="col-md-4 ChangeConfirm IO form-control" type="email" size="32" maxlength="128" data-rule="required,email" data-confirm="c_email" title="メールアドレス" path="mailAddress" /></td>
            </tr>
            <tr>
              <td class="TxtR">電話番号</td>
              <td><form:input name="tel" class="col-md-6 ChangeConfirm IO form-control" type="tel" data-rule="tel" data-confirm="c_tel" title="電話番号" path="phone" />
                <small>(ハイフンなしでお願いします)</small>
              </td>
            </tr>
            <tr>
              <td class="TxtR">お問い合わせ項目<em>※</em></td>
              <td>
                <form:select class="col-md-6 ChangeConfirm IO form-control" data-rule="required" data-confirm="c_infotes" title="お問い合わせ項目" path="subject">
                  <option value="" hidden>Choose</option>
                  <form:option value="修理店舗掲載についてのお問い合わせ">修理店舗掲載についてのお問い合わせ</form:option>
                  <form:option value="修理店舗掲載についての資料請求">修理店舗掲載についての資料請求</form:option>
                  <form:option value="修理についてのお問い合わせ">修理についてのお問い合わせ</form:option>
                  <form:option value="その他お問い合わせ">その他お問い合わせ</form:option>
                </form:select>
              </td>
            </tr>
            <tr>
              <td class="TxtR">お問い合わせ内容<em>※</em></td>
              <td><form:textarea name="contents" class="ChangeConfirm ImeModeActive IO form-control" cols="50" rows="6" maxlength="1000" data-rule="required" data-confirm="c_infos" title="お問い合わせ内容" path="message"></form:textarea></td>
            </tr>
          </tbody>
        </table>
        <br>
        <input type="button" class="col-md-4 btn" value=" 確認へ" id="goConfirm">
        <br>
      </div><!-- //入力画面 -->
      <div id="v2" class="ItemContent" style="display:none;"><!-- 確認画面 -->
        <h2><b>お問い合わせ確認</b></h2>
        <table class="Tbl">
          <tbody>
            <tr>
              <td class="TxtR">お名前<em>※</em></td>
              <td><span id="c_userName"></span></td>
            </tr>
            <tr>
              <td class="TxtR">メールアドレス<em>※</em></td>
              <td><span id="c_email"></span></td>
            </tr>
            <tr>
              <td class="TxtR">電話番号</td>
              <td><span id="c_tel"></span></td>
            </tr>
            <tr>
              <td class="TxtR">お問い合わせ項目</td>
              <td><span id="c_infotes"></span></td>
            </tr>
            <tr>
              <td class="TxtR">お問い合わせ内容<em>※</em></td>
              <td><span id="c_infos"></span></td>
            </tr>
          </tbody>
        </table>
        <div style="margin:1rem;">
          <input type="button" class="col-md-4 btn BackBtn" value=" 修正する " id="goBack" />
          <br>
          <input type="submit" class="col-md-4 btn" value=" 送信する " id="goSubmit" name="contact" />
        </div>
      </div><!-- 確認画面 -->
      <div id="v3" class="ItemContent" style="display:none;"><!-- 確認画面 -->
        <h1>送信完了しました</h1>
        <img class="contactSubImg" src="${pageContext.request.contextPath}/resources/app/img/animate/support.svg" alt="support">
      </div>
    </div>
    </form:form>
    <iframe name="send" style="width:0px;height:0px;border:0px;"></iframe>
  </section>
  <hr>
    <div class="modal js-modal">
      <div class="modal__bg js-modal-close"></div>
      <div class="modal__content">
          <ul id="accordion_menu">
            <li>
              <a data-toggle="collapse" href="#menu01" aria-controls="#menu01" aria-expanded="false">Apple</a>
            </li>
            <table id="menu01" class="collapse charge_table" data-parent="#accordion_menu">
              <tr class="charge_list">
                <th>機種</th>
                <th>ガラス割れ</th>
                <th>液晶不良</th>
                <th>バッテリー交換</th>
                <th>電源ボタン不良</th>
                <th>充電コネクタ不良</th>
                <th>水没修理</th>
              </tr>
              <c:forEach var="chargeList" varStatus="s" items="${chargeList}">
              <c:set var="maker" value="${f:h(chargeList.maker)}" />
              <c:if test="${maker == 'Apple'}">
              <tr class="charge_list">
                <th>${f:h(chargeList.model)}</th>
                <td>${f:h(chargeList.glass)}</td>
                <td>${f:h(chargeList.lcd)}</td>
                <td>${f:h(chargeList.battery)}</td>
                <td>${f:h(chargeList.power)}</td>
                <td>${f:h(chargeList.connector)}</td>
                <td>${f:h(chargeList.submerge)}</td>
              </tr>
              </c:if>
              </c:forEach>
            </table>
            <li>
              <a data-toggle="collapse" href="#menu02" aria-controls="#menu02" aria-expanded="false">SONY</a>
            </li>
            <table id="menu02" class="collapse charge_table" data-parent="#accordion_menu">
              <tr class="charge_list">
                <th>機種</th>
                <th>ガラス割れ</th>
                <th>液晶不良</th>
                <th>バッテリー交換</th>
                <th>電源ボタン不良</th>
                <th>充電コネクタ不良</th>
                <th>水没修理</th>
              </tr>
              <c:forEach var="chargeList" varStatus="s" items="${chargeList}">
              <c:set var="maker" value="${f:h(chargeList.maker)}" />
              <c:if test="${maker == 'SONY'}">
              <tr class="charge_list">
                <th>${f:h(chargeList.model)}</th>
                <td>${f:h(chargeList.glass)}</td>
                <td>${f:h(chargeList.lcd)}</td>
                <td>${f:h(chargeList.battery)}</td>
                <td>${f:h(chargeList.power)}</td>
                <td>${f:h(chargeList.connector)}</td>
                <td>${f:h(chargeList.submerge)}</td>
              </tr>
              </c:if>
              </c:forEach>
            </table>
            <li>
              <a data-toggle="collapse" href="#menu03" aria-controls="#menu03" aria-expanded="false">ASUS</a>
            </li>
            <table id="menu03" class="collapse charge_table" data-parent="#accordion_menu">
              <tr class="charge_list">
                <th>機種</th>
                <th>ガラス割れ</th>
                <th>液晶不良</th>
                <th>バッテリー交換</th>
                <th>電源ボタン不良</th>
                <th>充電コネクタ不良</th>
                <th>水没修理</th>
              </tr>
              <c:forEach var="chargeList" varStatus="s" items="${chargeList}">
              <c:set var="maker" value="${f:h(chargeList.maker)}" />
              <c:if test="${maker == 'ASUS'}">
              <tr class="charge_list">
                <th>${f:h(chargeList.model)}</th>
                <td>${f:h(chargeList.glass)}</td>
                <td>${f:h(chargeList.lcd)}</td>
                <td>${f:h(chargeList.battery)}</td>
                <td>${f:h(chargeList.power)}</td>
                <td>${f:h(chargeList.connector)}</td>
                <td>${f:h(chargeList.submerge)}</td>
              </tr>
              </c:if>
              </c:forEach>
            </table>
            <li>
              <a data-toggle="collapse" href="#menu04" aria-controls="#menu04" aria-expanded="false">Microsoft</a>
            </li>
            <table id="menu04" class="collapse charge_table" data-parent="#accordion_menu">
              <tr class="charge_list">
                <th>機種</th>
                <th>ガラス割れ</th>
                <th>液晶不良</th>
                <th>バッテリー交換</th>
                <th>電源ボタン不良</th>
                <th>充電コネクタ不良</th>
                <th>水没修理</th>
              </tr>
              <c:forEach var="chargeList" varStatus="s" items="${chargeList}">
              <c:set var="maker" value="${f:h(chargeList.maker)}" />
              <c:if test="${maker == 'Microsoft'}">
              <tr class="charge_list">
                <th>${f:h(chargeList.model)}</th>
                <td>${f:h(chargeList.glass)}</td>
                <td>${f:h(chargeList.lcd)}</td>
                <td>${f:h(chargeList.battery)}</td>
                <td>${f:h(chargeList.power)}</td>
                <td>${f:h(chargeList.connector)}</td>
                <td>${f:h(chargeList.submerge)}</td>
              </tr>
              </c:if>
              </c:forEach>
            </table>
          </ul>
      </div>
      <a class="js-modal-close" href="">×</a>
    </div>
    <%-- <c:forEach var="chargeList" varStatus="s" items="${chargeList}">
            <p>${f:h(chargeList.shopId)}</p>
            <p>${f:h(chargeList.maker)}</p>
            <p>${f:h(chargeList.model)}</p>
            <p>${f:h(chargeList.glass)}</p>
    </c:forEach> --%>
</main>
