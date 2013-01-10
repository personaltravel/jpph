<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html>

<head>
    <title>${pageTitle?html}</title>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="PageName" content="${pageName}"/>
</head>

<body>

<form id="searchform">
    <input type="hidden" id="page-name-field" value="${pageName!""}"/>

    <#attempt>
        <#include "/hotel/searchBox.ftl"/>
    <#recover>
    </#attempt>

	<#if displayDeals?? && displayDeals>
	    <div id="dealsDiv">
	        <#attempt>
	            <#include "/hotel/topDeals.ftl"/>
	        <#recover>
	        </#attempt>
	    </div>
	</#if>
</form>

</body>
</html>
