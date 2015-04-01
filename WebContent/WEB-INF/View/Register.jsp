<%@ page contentType="text/html;charset=UTF-8"%>
<table
	style="width: 100%; height: 100%; text-align: left; display: table-cell;">
	<tr style="text-align: center;">
		<td colspan="6"><h2>Basic Information</h2></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="name">姓名:</label></td>
		<td><input id="name" type="text" /></td>
		<td><label>性别:</label></td>
		<td><select id="sex">
				<option value="男">先生</option>
				<option value="女">女士</option>
		</select></td>
		<td colspan="2" rowspan="10"><img src="" alt="click to upload"
			style="width: 200px; height: 300px;" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="nation">民族:</label></td>
		<td><input id="nation" type="text" /></td>
		<td><label for="household">现户籍:</label></td>
		<td><input id="household" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="year">出生日期:</label></td>
		<td><select id="year">
				<option value=1970>1970</option>
				<option value=1971>1971</option>
				<option value=1972>1972</option>
				<option value=1973>1973</option>
				<option value=1974>1974</option>
				<option value=1975>1975</option>
				<option value=1976>1976</option>
				<option value=1977>1977</option>
				<option value=1978>1978</option>
				<option value=1979>1979</option>
				<option value=1980>1980</option>
				<option value=1981>1981</option>
				<option value=1982>1982</option>
				<option value=1983>1983</option>
				<option value=1984>1984</option>
				<option value=1985>1985</option>
				<option value=1986>1986</option>
				<option value=1987>1987</option>
				<option value=1988>1988</option>
				<option value=1989>1989</option>
				<option value=1990 selected="selected">1990</option>
				<option value=1991>1991</option>
				<option value=1992>1992</option>
				<option value=1993>1993</option>
				<option value=1994>1994</option>
				<option value=1995>1995</option>
				<option value=1996>1996</option>
				<option value=1997>1997</option>
				<option value=1998>1998</option>
				<option value=1999>1999</option>
				<option value=2000>2000</option>
				<option value=2001>2001</option>
				<option value=2002>2002</option>
				<option value=2003>2003</option>
				<option value=2004>2004</option>
				<option value=2005>2005</option>
				<option value=2006>2006</option>
				<option value=2007>2007</option>
				<option value=2008>2008</option>
				<option value=2009>2009</option>
				<option value=2010>2010</option>
				<option value=2011>2011</option>
				<option value=2012>2012</option>

		</select> <select id="month">
				<option value=1 selected="selected">1</option>
				<option value=2>2</option>
				<option value=3>3</option>
				<option value=4>4</option>
				<option value=5>5</option>
				<option value=6>6</option>
				<option value=7>7</option>
				<option value=8>8</option>
				<option value=9>9</option>
				<option value=10>10</option>
				<option value=11>11</option>
				<option value=12>12</option>
		</select> <select id="day">
				<option value=1 selected="selected">1</option>
				<option value=2>2</option>
				<option value=3>3</option>
				<option value=4>4</option>
				<option value=5>5</option>
				<option value=6>6</option>
				<option value=7>7</option>
				<option value=8>8</option>
				<option value=9>9</option>
				<option value=10>10</option>
				<option value=11>11</option>
				<option value=12>12</option>
				<option value=13>13</option>
				<option value=14>14</option>
				<option value=15>15</option>
				<option value=16>16</option>
				<option value=17>17</option>
				<option value=18>18</option>
				<option value=19>19</option>
				<option value=20>20</option>
				<option value=21>21</option>
				<option value=22>22</option>
				<option value=23>23</option>
				<option value=24>24</option>
				<option value=25>25</option>
				<option value=26>26</option>
				<option value=27>27</option>
				<option value=28>28</option>
				<option value=29>29</option>
				<option value=30>30</option>
				<option value=31>31</option>

		</select></td>
		<td><label for="age">年龄:</label></td>
		<td><input id="age" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="bodyH1">身高:</label></td>
		<td><select id="bodyH1">
				<option value="1" selected="selected">1米</option>
				<option value="2">2米</option>
		</select> <select id="bodyH2">
				<option value="00">00</option>
				<option value="05">05</option>
				<option value="10">10</option>
				<option value="15">15</option>
				<option value="20">20</option>
				<option value="25">25</option>
				<option value="30">30</option>
				<option value="35">35</option>
				<option value="40">40</option>
				<option value="45">45</option>
				<option value="50">50</option>
				<option value="55">55</option>
				<option value="60">60</option>
				<option value="65" selected="selected">65</option>
				<option value="70">70</option>
				<option value="75">75</option>
				<option value="80">80</option>
				<option value="85">85</option>
				<option value="90">90</option>
				<option value="95">95</option>
		</select></td>
		<td><label for="weight">体重:</label></td>
		<td><input id="weight" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="bloodType">血型:</label></td>
		<td><select id="bloodType">
				<option value="A">A</option>
				<option value="B">B</option>
				<option value="O" selected="selected">O</option>
				<option value="AB">AB</option>
				<option value="X">X</option>
		</select></td>
		<td><label for="constellation">星座:</label></td>
		<td><select id="constellation">
				<option value="摩羯座" selected="selected">摩羯座</option>
				<option value="水瓶座">水瓶座</option>
				<option value="双鱼座">双鱼座</option>
				<option value="白羊座">白羊座</option>
				<option value="金牛座">金牛座</option>
				<option value="双子座">双子座</option>
				<option value="巨蟹座">巨蟹座</option>
				<option value="狮子座">狮子座</option>
				<option value="处女座">处女座</option>
				<option value="天秤座">天秤座</option>
				<option value="天蝎座">天蝎座</option>
				<option value="射手座">射手座</option>
		</select></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="Zodiac">生肖:</label></td>
		<td><select id="Zodiac">
				<option value="鼠">鼠</option>
				<option value="牛">牛</option>
				<option value="虎">虎</option>
				<option value="兔">兔</option>
				<option value="龙">龙</option>
				<option value="蛇">蛇</option>
				<option value="马">马</option>
				<option value="羊">羊</option>
				<option value="猴">猴</option>
				<option value="鸡">鸡</option>
				<option value="狗">狗</option>
				<option value="猪">猪</option>
		</select></td>
		<td><label for="identity">身份证号:</label></td>
		<td><input id="identity" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="married">婚烟状况:</label></td>
		<td><select id="married">
				<option value="未婚" selected="selected">未婚</option>
				<option value="离异">离异</option>
				<option value="丧偶">丧偶</option>
		</select></td>
		<td><label for="interesting">兴旺爱好:</label></td>
		<td><input id="interesting" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="childCondition">子女情况:</label></td>
		<td><input id="childCondition" type="text" /></td>
		<td><label for="partyCondition">择偶条件:</label></td>
		<td><input id="partyCondition" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="houseCondition">住房情况:</label></td>
		<td><input id="houseCondition" type="text" /></td>
		<td><label for="friendCondition">交友宣言:</label></td>
		<td><input id="friendCondition" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="dateStatus">相亲状态:</label></td>
		<td><input id="dateStatus" type="text" /></td>
		<td><label for="remark">备注:</label></td>
		<td><input id="remark" type="text" /></td>
	</tr>
	<tr style="text-align: center;">
		<td colspan="6"><h2>Family Information</h2></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="fatherInfo">父亲单位及职业:</label></td>
		<td colspan="5"><input id="fatherInfo" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="motherInfo">母亲单位及职业:</label></td>
		<td colspan="5"><input id="motherInfo" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="parentHouse">父母居住地:</label></td>
		<td><input id="parentHouse" type="text" /></td>
		<td><label for="myHouse">本人居住地:</label></td>
		<td><input id="myHouse" type="text" /></td>
		<td colspan="2"></td>
	</tr>
	<tr style="text-align: center;">
		<td colspan="6"><h2>Educate Information</h2></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="college">毕业院校:</label></td>
		<td><input id="college" type="text" /></td>
		<td><label for="education">最高学历:</label></td>
		<td><input id="education" type="text" /></td>
		<td><label for="major">专业:</label></td>
		<td><input id="major" type="text" /></td>
	</tr>
	<tr style="text-align: center;">
		<td colspan="6"><h2>Job Information</h2></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="company">单位与部门:</label></td>
		<td><input id="company" type="text" /></td>
		<td><label for="position">岗位:</label></td>
		<td><input id="position" type="text" /></td>
		<td><label for="salary">月薪:</label></td>
		<td><input id="salary" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="industry">行业性质:</label></td>
		<td><input id="industry" type="text" /></td>
		<td><label for="bodyRank">员工身份:</label></td>
		<td><input id="bodyRank" type="text" /></td>
		<td><label for="job_others">其他:</label></td>
		<td><input id="job_others" type="text" /></td>
	</tr>
	<tr style="text-align: center;">
		<td colspan="6"><h2>Communication Information</h2></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="mobile">手机:</label></td>
		<td><input id="mobile" type="text" /></td>
		<td><label for="tel">固话:</label></td>
		<td><input id="tel" type="text" /></td>
		<td><label for="weChat">微信:</label></td>
		<td><input id="weChat" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="email">邮箱:</label></td>
		<td><input id="email" type="text" /></td>
		<td><label for="qq">QQ:</label></td>
		<td><input id="qq" type="text" /></td>
		<td><label for="com_others">其他:</label></td>
		<td><input id="com_others" type="text" /></td>
	</tr>
	<tr style="text-align: center;">
		<td colspan="6"><h2>Broker Information</h2></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="broker">介绍人:</label></td>
		<td><input id="broker" type="text" /></td>
		<td><label for="broker_relate">与被介绍人关系:</label></td>
		<td><input id="broker_relate" type="text" /></td>
		<td><label for="broker_tel">介绍人电话:</label></td>
		<td><input id="broker_tel" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="Matchmaker">红娘姓名:</label></td>
		<td><input id="Matchmaker" type="text" /></td>
		<td><label for="Matchmaker_dep">红娘单位:</label></td>
		<td><input id="Matchmaker_dep" type="text" /></td>
		<td><label for="Matchmaker_tel">联系方式:</label></td>
		<td><input id="Matchmaker_tel" type="text" /></td>
	</tr>
	<tr style="vertical-align: top;">
		<td><label for="Matchmaker_recom">红娘推荐:</label></td>
		<td colspan="3"><input id="Matchmaker_recom" type="text" /></td>
		<td><input id="registerBtn" type="button" value="注册" /></td>
		<td><input id="resetBtn" type="button" value="重置" /></td>
	</tr>
</table>