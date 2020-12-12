using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }



    protected void Button1_Click(object sender, EventArgs e)
    {
        ServiceReference1.WebServiceSoapClient ws = new ServiceReference1.WebServiceSoapClient();
        ServiceReference2.NewWebServiceClient wsjava = new ServiceReference2.NewWebServiceClient();
        GridView1.DataSource = ws.Alumnoci(int.Parse(TextBox1.Text));
         TextBox2.Text=String.Join(" | ",wsjava.operation(int.Parse(TextBox1.Text)));
        GridView1.DataBind();
    }
}