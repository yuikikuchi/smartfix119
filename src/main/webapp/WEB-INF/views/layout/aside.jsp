<aside>
<section id="maker2_section" class="section_box">
<h2><b>モデル</b></h2>
          <ul id="accordion_menu">
            <li>
              <a data-toggle="collapse" href="#menu10" aria-controls="#menu10" aria-expanded="false">Apple</a>
            </li>
            <table id="menu10" class="collapse charge_table" data-parent="#accordion_menu">
              <tr class="charge_list">
                <th>モデル</th>
                <th>発売日</th>
              </tr>
              <c:forEach var="makerList" varStatus="s" items="${makerList}">
              <c:set var="makerName" value="${f:h(makerList.makerName)}" />
              <c:if test="${makerName == 'Apple'}">
                <tr class="charge_list">
                  <th><a href="<c:url value="/model"><c:param name="modelName" value="${f:h(makerList.modelName)}" /></c:url>">${f:h(makerList.modelName)}</a></th>
                  <td>${f:h(makerList.releaseDay)}</td>
                </tr>
              </c:if>
              </c:forEach>
            </table>
            <li>
              <a data-toggle="collapse" href="#menu11" aria-controls="#menu11" aria-expanded="false">SHARP</a>
            </li>
            <table id="menu11" class="collapse charge_table" data-parent="#accordion_menu">
              <tr class="charge_list">
                <th>モデル</th>
                <th>発売日</th>
              </tr>
              <c:forEach var="makerList" varStatus="s" items="${makerList}">
              <c:set var="makerName" value="${f:h(makerList.makerName)}" />
              <c:if test="${makerName == 'SHARP'}">
                <tr class="charge_list">
                  <th><a href="<c:url value="/model"><c:param name="modelName" value="${f:h(makerList.modelName)}" /></c:url>">${f:h(makerList.modelName)}</a></th>
                  <td>${f:h(makerList.releaseDay)}</td>
                </tr>
              </c:if>
              </c:forEach>
            </table>
          </ul>
</section>
<hr>
</aside>
