<?xml version="1.0" encoding="UTF-8"?>
<!--
Document   : MyBookSchema.xsl
Created on : January 22, 2012, 8:46 PM
Author     : suitcase
Description:
Purpose of transformation follows.
-->
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:dc="http://purl.org/dc/elements/1.1/"
xmlns:mb="http://xml.netbeans.org/schema/MyBookListSchema"
xmlns:dcterms="http://purl.org/dc/terms/">
<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes" omit-xml-declaration="yes"/>
<xsl:template match="/mb:BookList">
    <xsl:element name="mb:BookList">          
        <xsl:apply-templates select="./mb:Book"/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:Book">
    <xsl:element name="mb:Book">   
        <xsl:attribute name="xsi:schemaLocation">http://purl.org/dc/terms/ http://dublincore.org/schemas/xmls/qdc/dcterms.xsd</xsl:attribute>
        <xsl:apply-templates select="./mb:header"/>
        <xsl:apply-templates select="./mb:metadata"/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:header">
    <xsl:element name="mb:header">
        <xsl:apply-templates select="./mb:id"/>
        <xsl:apply-templates select="./mb:created"/>
        <xsl:apply-templates select="./mb:lastModified"/>
        <xsl:apply-templates select="./mb:status"/> 
    </xsl:element>
</xsl:template>
<xsl:template match="mb:metadata">
    <xsl:element name="mb:metadata">
        <xsl:apply-templates select="./mb:title"/>
        <xsl:apply-templates select="./mb:creator"/>
        <xsl:apply-templates select="./mb:description"/>
        <xsl:apply-templates select="./mb:publisher"/>
        <xsl:apply-templates select="./mb:editor"/>
        <xsl:apply-templates select="./mb:type"/>
        <xsl:apply-templates select="./mb:format"/>
        <xsl:apply-templates select="./mb:isbn"/>
        <xsl:apply-templates select="./mb:rights"/>
        <xsl:apply-templates select="./mb:copyrightDate"/>
        <xsl:apply-templates select="./mb:publicationDate"/>
        <xsl:apply-templates select="./mb:reprintingDate"/>
        <xsl:apply-templates select="./mb:publicationPlace"/>
        <xsl:apply-templates select="./mb:objectUri"/>
        <xsl:apply-templates select="./mb:noOfPages"/>   
   </xsl:element>
</xsl:template>
<!-- DC Element Instantiation -->
<xsl:template match="mb:BookList/mb:Book/mb:header/mb:id">
    <xsl:element name="mb:id">
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:header/mb:created">
    <xsl:element name="mb:created">
        <xsl:apply-templates select="@date"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:header/mb:lastModified">
    <xsl:element name="mb:lastModified">
        <xsl:apply-templates select="@date"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:header/mb:status">
    <xsl:element name="mb:status">
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:isbn">
    <xsl:element name="dc:identifier">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:title">
    <xsl:element name="dc:title">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:creator">
    <xsl:element name="dc:creator">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:description">
    <xsl:element name="dc:description">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:publisher">
    <xsl:element name="dc:publisher">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:editor">
    <xsl:element name="dcterms:contributor">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:type">
    <xsl:element name="dc:type">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:format">
    <xsl:element name="dc:format">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:rights">
    <xsl:element name="dc:rights">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:copyrightDate">
    <xsl:element name="dcterms:dateCopyrighted">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:reprintingDate">
    <xsl:element name="dcterms:modified">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:publicationDate">
    <xsl:element name="dcterms:issued">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:publicationPlace">
    <xsl:element name="dcterms:spatial">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:objectUri">
    <xsl:element name="dc:source">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>
<xsl:template match="mb:BookList/mb:Book/mb:metadata/mb:noOfPages">
    <xsl:element name="dcterms:extent">
        <xsl:apply-templates select="@xml:lang"/>
        <xsl:value-of select="."/>
    </xsl:element>
</xsl:template>        
<xsl:template match="@xml:lang">
    <xsl:if test=".">
        <xsl:attribute name="xml:lang">
            <xsl:value-of select="."/>
        </xsl:attribute>
    </xsl:if>
</xsl:template>
</xsl:stylesheet>