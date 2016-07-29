<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <body>

                <div align="center">
                    <h2>basketball</h2>
                    <xsl:for-each select="mixedteams/basketball">
                        <xsl:variable name = "Color" select="Color"/>
                        <xsl:variable name = "BColor" select="BColor"/>
                        <xsl:variable name = "Image" select="Image"/>
                        <xsl:variable name = "Video" select="Video"/>
                        <table border="1px" style='text-align: center;background-color:{$BColor};color:{$Color}'>
                        <tr>

                            <td colspan="6" width="900px" height="100px" ><xsl:value-of select="Team"/></td>

                        </tr>
                        <tr height='100px'> <td>image </td> <td colspan='3' width="300px"> all-star </td> <td> coach </td> <td> stadium </td> </tr>
                        <tr>
                            <td height="100px"> <img src="{$Image}" width='50px'></img></td>

                            <td><xsl:value-of select="All-star/name"/></td>
                            <td>age:<xsl:value-of select="All-star/age"/></td>
                            <td><xsl:value-of select="All-star/position"/></td>
                            <td><xsl:value-of select="Coach"/></td>
                            <td><xsl:value-of select="Stadium"/></td>
                        </tr>
                        <tr>
                            <td colspan="6">
                                <iframe width='100%' height='200px' src="{$Video}"></iframe>
                            </td>
                        </tr>
                        </table>
                    </xsl:for-each>


                </div>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>