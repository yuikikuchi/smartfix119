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
                <div class="image-box"><img src="${pageContext.request.contextPath}/resources/app/img/shopcard_image.JPG"></div>
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
                    <div class="shop_tag"><p>総務省登録</p></div>
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
                  <!-- <a class="js-modal-open charge" href="">修理料金</a> -->
                </div>
              </div>
            </div>
          </div>
        </div>
      </c:forEach>
    </div>
    
    <t:pagination criteriaQuery="area=${f:h(areaList.area2Name2)}" page="${page}" outerElementClass="pagination" maxDisplayCount="0" previousLinkText="Prev" nextLinkText="Next" />
    
    <div class="totalPages">
      ${f:h(page.number + 1) } / 
      ${f:h(page.totalPages)} Pages
    </div>
  </section>
  
  <section id="news_section" class="section_box">
    <script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
    <ins class="adsbygoogle" style="display:block" data-ad-format="fluid" data-ad-layout-key="-e8+6u+4k-nl+vr" data-ad-client="ca-pub-8632151441121053" data-ad-slot="2337459895"></ins>
    <script>(adsbygoogle = window.adsbygoogle || []).push({});</script>
  </section>
  <hr>
</main>
