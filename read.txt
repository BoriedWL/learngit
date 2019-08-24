这是一个JAVA与JDBC应用的接口，还未完全成型。

定义包含StudentMessage，TeacherMessage，BookMessage等5个储存信息类

定义了5个接口，分别处理“管理书功能”，“征订管理”，“课程功能”，“储存功能”，“使用者功能”

管理书功能包含：录入，查询，修改，浏览全部
征订管理包含：录入信息，查找，汇总
课程功能包含：课程录入，课程查询
储存功能包含：学生，教师，书籍，征订信息和课程信息的存储
使用者功能包含：学生与教师的信息录入

实现接口主要通过传递参数进行方法的数据处理，使用ArrayList数组储存信息对象，最后传输信息对象到存储数据库类中存入数据库

链接数据库使用了JDBC，实现储存功能接口定义的方法

利用PreparedStatement类的setString等方法传递数值到SQL语句
//String sql="INSERT INTO textbooks(ISBN,name,press,author,price)"+"values("+"?,?,?,?,?)";
//PreparedStatement ptmt = conn.prepareStatement(sql);
//ptmt.setString(1, b.getISBN());

信息处理由定义的信息控制类实现各个功能的接口方法

