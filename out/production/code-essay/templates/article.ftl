<!doctype html>
<#include "includes/header.ftl"/>
<#include "includes/menu.ftl"/>

<div class="jumbotron">
    <div class="container">
        <h1>${article.title}</h1>
        <#if article.subTitle??>
            <h2>${article.subTitle}</h2>
        </#if>
        <span>${article.publishTime}</span>
        <span>${article.authorName}</span>
        <hr/>
        <div>
            ${article.content}
        </div>
    </div>
</div>

<#if articleRelativityList??>
<div class="container">
    <div class="row">
        <#list articleRelativityList as articleRelativity>
            <div class="col-md-4">
                ${articleRelativity.article2.title}
            </div>
        </#list>

    </div>
</div>
</#if>

<hr>
<#include "includes/footer.ftl"/>

