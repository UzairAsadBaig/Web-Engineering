<HTML>
<HEAD>
<TITLE>Reusing JavaBeans in JSP</TITLE>
</HEAD>

<BODY>

<CENTER>
<TABLE BORDER=5>
  <TR><TH>
      Reusing JavaBeans in JSP</TABLE>
</CENTER>
<P>

<jsp:useBean id="test" class="MyPack.aBean" />

<jsp:setProperty name="test" property="message" value="Hello World" />
             
<H1>Message: <I><jsp:getProperty name="test" property="message" /></I></H1>
             
</BODY>
</HTML>