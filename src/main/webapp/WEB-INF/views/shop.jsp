<main>
<section id="model_section" class="section_box_top">
    <div class="breadcrumbs">
      <a href="<%= request.getContextPath() %>/#search_section">検索</a>
      <a href="<c:url value="/search"><c:param name="area" value="${area}" /></c:url>">${areaName}</a>
      <a class="active">${f:h(shop.shopName)}</a>
    </div>

<div class="parallax-bg1">
      <div class="parallax-bg2">
        <div class="rwdBox">
        
          <div class="cssTest">
            <img alt="image" class="img-fluid" src="${pageContext.request.contextPath}/resources/app/img/shopcard_image.JPG">
          </div>
          <div class="cssTest2">
              <h1>${f:h(shop.shopName)}</h1>
                  <p>【店舗紹介】<br><!-- 100文字 -->
                    ${f:h(shop.introduction)}
                  </p>
                  <c:set var="officialFlg" value="${f:h(shop.officialFlg)}" />
                  <c:if test="${officialFlg == '1'}">
                    <div class="shop_tag"><p>総務省登録</p></div>
                  </c:if>
                  <c:set var="appleFlg" value="${f:h(shop.appleFlg)}" />
                  <c:if test="${appleFlg == '1'}">
                    <div class="shop_tag"><p>Apple</p></div>
                  </c:if>
                  <c:set var="androidFlg" value="${f:h(shop.androidFlg)}" />
                  <c:if test="${androidFlg == '1'}">
                    <div class="shop_tag"><p>Android</p></div>
                  </c:if>
              <div class="rwdBox2">
              
              <div class="tableTest3">
                  <table border>
                    <tr>
                     <th>アドレス</th>
                     <td>${f:h(shop.location01)}</td>
                    </tr>
                    <tr>
                     <th>アクセス</th>
                     <td>${f:h(shop.location02)}</td>
                    </tr>
                    <tr>
                     <th>営業時間</th>
                     <td>${f:h(shop.businessHour01)}</td>
                    </tr>
                    <tr>
                     <th>電話番号</th>
                     <td>${f:h(shop.phoneNo01)}</td>
                    </tr>
                    <tr>
                     <th>定休日</th>
                     <td>${f:h(shop.holidays)}</td>
                    </tr>
                  </table>
                  </div>
              </div>
              <a class="btn card_btn" href="${f:h(shop.shopSite)}" target="_blank" rel="noopener noreferrer" onclick="gtag('event', 'READ MORE', {'event_category': 'HPクリック', 'event_label': '${f:h(shop.shopName)}'});" role="button">Read More</a>
           </div>
       </div> 
       <iframe src="${f:h(shop.map)}"></iframe>
      </div> 
    </div>
<%-- </c:forEach> --%>
</section>

  <section class="section_box pcview">
    <!-- BIGLOBEモバイル -->
    <ul class="ads">
      <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887065228"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887065228" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887065228" border="0"></a></noscript>
        </div>
      </li>
      <!-- <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887064552"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887064552" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887064552" border="0"></a></noscript>
        </div>
      </li> -->
      <!-- <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887064553"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887064553" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887064553" border="0"></a></noscript>
        </div>
      </li> -->
      <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887065230"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887065230" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887065230" border="0"></a></noscript>
        </div>
      </li>
      <!-- <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887064558"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887064558" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887064558" border="0"></a></noscript>
        </div>
      </li> -->
      <!-- <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887064560"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887064560" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887064560" border="0"></a></noscript>
        </div>
      </li> -->
    </ul>
  </section>
  <section class="section_box spview">
    <!-- BIGLOBEモバイル -->
    <ul class="ads">
      <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887065280"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887065280" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887065280" border="0"></a></noscript>
        </div>
      </li>
      <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887065282"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887065282" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887065282" border="0"></a></noscript>
        </div>
      </li>
      <!-- <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887064553"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887064553" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887064553" border="0"></a></noscript>
        </div>
      </li> -->
      <!-- <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887065231"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887065231" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887065231" border="0"></a></noscript>
        </div>
      </li> -->
      <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887065272"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887065272" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887065272" border="0"></a></noscript>
        </div>
      </li>
      <!-- <li class="ads_item responsive">
        <div class="ads_img">
          <script src="//ad.jp.ap.valuecommerce.com/servlet/jsbanner?sid=3585684&pid=887064560"></script><noscript><a href="//ck.jp.ap.valuecommerce.com/servlet/referral?sid=3585684&pid=887064560" rel="nofollow"><img src="//ad.jp.ap.valuecommerce.com/servlet/gifbanner?sid=3585684&pid=887064560" border="0"></a></noscript>
        </div>
      </li> -->
    </ul>
  </section>
<hr>
</main>