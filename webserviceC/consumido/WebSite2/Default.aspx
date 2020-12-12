<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <h1>Encontrar materias de Alumno</h1>
        

    </div>        
        <p>
            Ingrese el CI del alumno<asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        </p>
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Buscar" />
        <asp:GridView ID="GridView1" runat="server">
        </asp:GridView>
        En JAVA
        <asp:TextBox ID="TextBox2" runat="server" Width="264px"></asp:TextBox>
    </form>
</body>
</html>
