<main>
<section id="model_section" class="section_box_top">
<c:forEach var="modelList" varStatus="s" items="${modelList}">
<c:set var="maker" value="${f:h(chargeList.maker)}" />
  <div class="breadcrumbs">
    <c:set var="session" value="${session}" />
    <c:if test="${session == 'top'}">
      <a href="<%= request.getContextPath() %>/#maker2_section">モデル</a>
      <a class="active">${f:h(modelList.modelName)}</a>
    </c:if>
    <c:if test="${session == 'search'}">
      <a href="<%= request.getContextPath() %>/#search_section">検索</a>
      <a href="<c:url value="/search"><c:param name="area" value="${area}" /></c:url>">${areaName}</a>
      <a class="active">${f:h(modelList.modelName)}</a>
    </c:if>
  </div>

<div class="parallax-bg1">
      <div class="parallax-bg2">
        <div class="rwdBox">
        
          <div class="cssTest">
            <img alt="image" class="img-fluid" src="${pageContext.request.contextPath}/resources/app/img/model/${f:h(modelList.makerName)}/${f:h(modelList.modelName)}.png">
          </div>
          <div class="cssTest2">
              <h1>${f:h(modelList.modelName)}</h1>
              <div class="rwdBox2">
              
              <div class="tableTest">
                  <table border>
                    <tr>
                     <th>発売日</th>
                     <td>${f:h(modelList.releaseDay)}</td>
                    </tr>
                    <tr>
                     <th>キャリア</th>
                     <td>${f:h(modelList.carriers)}</td>
                    </tr>
                    <tr>
                     <th>ディスプレイ</th>
                     <td>${f:h(modelList.display)}</td>
                    </tr>
                    <tr>
                     <th>ストレージ</th>
                     <td>${f:h(modelList.storage)}</td>
                    </tr>
                    <tr>
                     <th>CPU</th>
                     <td>${f:h(modelList.cpu)}</td>
                    </tr>
                  </table>
                  </div>
                  <div class="tableTest">
                  <table border>
                    <tr>
                     <th>メモリ</th>
                     <td>${f:h(modelList.memory)}</td>
                    </tr>
                    <tr>
                     <th>バッテリー</th>
                     <td>${f:h(modelList.battery)}</td>
                    </tr>
                    <tr>
                     <th>メインカメラ</th>
                     <td>${f:h(modelList.mainCamera)}</td>
                    </tr>
                    <tr>
                     <th>サブカメラ</th>
                     <td>${f:h(modelList.subCamera)}</td>
                    </tr>
                    <tr>
                     <th>OS</th>
                     <td>${f:h(modelList.os)}</td>
                    </tr>
                  </table>
              </div>
              </div>
           </div>
       </div> 
      </div> 
    </div>
</c:forEach>
</section>

<section id="news_section" class="section_box">
  <script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
  <ins class="adsbygoogle" style="display:block" data-ad-format="fluid" data-ad-layout-key="-e8+6u+4k-nl+vr" data-ad-client="ca-pub-8632151441121053" data-ad-slot="2337459895"></ins>
  <script>(adsbygoogle = window.adsbygoogle || []).push({});</script>
</section>
<hr>
</main>