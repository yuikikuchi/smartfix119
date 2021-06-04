<main>
  <input type="hidden" id="areaName" value="${f:h(areaList.area2Name2)}" />
  <section class="section_box_top">
    <div class="breadcrumbs">
      <a href="<%= request.getContextPath() %>/#search_section">検索</a>
      <a class="active">${f:h(areaList.area2Name)}</a>
    </div>
    
    <hr>
    
    <div>
      <p>※新型コロナウイルス（COVID-19）の影響により営業時間やサービス内容が異なる場合があります。</p>
      <p>修理料金や修理時間については必ず各店舗のHPをご確認の上、各店舗への問い合わせをお願いいたします。</p>
    </div>
    
    <div class="storeList">
      <div class="storeMap">
        <div id="map"></div>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBAXRZQWeta9gU2D-AU-EbRe5DrnEotYfs&callback=initMap" async="async" defer="defer"></script>
      </div>
      <div class="storeName">
        <h2><b>${f:h(areaList.area2Name)} エリア</b></h2>
        <ul>
          <c:set var="count" value="0" />
          <c:forEach var="shopList" varStatus="s" items="${page.content}">
            <c:set var="count" value="${count + 1}" />
            <%-- <input type="hidden" id="mapData" value="${f:h(count)}" /> --%>
            <%-- <input type="hidden" id="mapData" value="${f:h(areaList.area2Name)}" /> --%>
            <input type="hidden" id="photo${count}" src="${pageContext.request.contextPath}/resources/app/img/marker/marker${count}.png" />
            <li id="shopNo${count}"><a class="shopName" href="#">${f:h(shopList.shopName)} →</a></li>
          </c:forEach>
        </ul>
      </div>
    </div>
    
    <t:pagination criteriaQuery="area=${f:h(areaList.area2Name2)}" page="${page}" outerElementClass="pagination" maxDisplayCount="0" previousLinkText="Prev" nextLinkText="Next" />
    
    <div class="totalPages">
      ${f:h(page.number + 1) } / 
      ${f:h(page.totalPages)} Pages
    </div>
  </section>
  
    <hr>
</main>