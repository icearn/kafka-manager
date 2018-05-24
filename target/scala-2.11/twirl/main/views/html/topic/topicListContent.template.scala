
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object topicListContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object topicListContent_Scope1 {
import kafka.manager.utils.LongFormatted

class topicListContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.TopicIdentity]], Boolean]],IndexedSeq[String],Boolean,Boolean,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(cluster: String,
  topics: IndexedSeq[((String, Option[kafka.manager.model.ActorModel.TopicIdentity]),Boolean)],
  topicsUnderReassignment: IndexedSeq[String],
  pollConsumers: Boolean,
  displayTopicSize: Boolean
)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*13.2*/getDeletedLevel/*13.17*/(deleted: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.39*/("""
    """),_display_(/*14.6*/deleted/*14.13*/ match/*14.19*/ {/*15.9*/case true =>/*15.21*/ {_display_(Seq[Any](format.raw/*15.23*/("""danger""")))}/*16.9*/case i =>/*16.18*/ {}}),format.raw/*17.6*/("""
""")))};def /*20.2*/getBrokersSpreadLevel/*20.23*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.44*/("""
    """),_display_(/*21.6*/percentage/*21.16*/ match/*21.22*/ {/*22.9*/case i if i > 50 && i <= 75 =>/*22.39*/ {_display_(Seq[Any](format.raw/*22.41*/("""warning""")))}/*23.9*/case i if i <= 50 =>/*23.29*/ {_display_(Seq[Any](format.raw/*23.31*/("""danger""")))}/*24.9*/case i =>/*24.18*/ {}}),format.raw/*25.6*/("""
""")))};def /*28.2*/getBrokersSkewLevel/*28.21*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*28.42*/("""
    """),_display_(/*29.6*/percentage/*29.16*/ match/*29.22*/ {/*30.9*/case i if i > 0 && i <= 33 =>/*30.38*/ {_display_(Seq[Any](format.raw/*30.40*/("""warning""")))}/*31.9*/case i if i >= 34 =>/*31.29*/ {_display_(Seq[Any](format.raw/*31.31*/("""danger""")))}/*32.9*/case i =>/*32.18*/ {}}),format.raw/*33.6*/("""
""")))};def /*36.2*/getBrokersLeaderSkewLevel/*36.27*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*36.48*/("""
    """),_display_(/*37.6*/percentage/*37.16*/ match/*37.22*/ {/*38.9*/case i if i > 0 && i <= 33 =>/*38.38*/ {_display_(Seq[Any](format.raw/*38.40*/("""warning""")))}/*39.9*/case i if i >= 34 =>/*39.29*/ {_display_(Seq[Any](format.raw/*39.31*/("""danger""")))}/*40.9*/case i =>/*40.18*/ {}}),format.raw/*41.6*/("""
""")))};def /*44.2*/getUnderReplicatedLevel/*44.25*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*44.46*/("""
    """),_display_(/*45.6*/percentage/*45.16*/ match/*45.22*/ {/*46.9*/case i if i > 0 && i <= 33 =>/*46.38*/ {_display_(Seq[Any](format.raw/*46.40*/("""warning""")))}/*47.9*/case i if i >= 34 =>/*47.29*/ {_display_(Seq[Any](format.raw/*47.31*/("""danger""")))}/*48.9*/case i =>/*48.18*/ {}}),format.raw/*49.6*/("""
""")))};def /*52.2*/getReassignmentStatus/*52.23*/(topic: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*52.42*/("""
    """),_display_(/*53.6*/if(topicsUnderReassignment.contains(topic))/*53.49*/ {_display_(Seq[Any](format.raw/*53.51*/("""glow-red""")))}/*53.61*/else/*53.66*/{}),format.raw/*53.68*/("""
""")))};
Seq[Any](format.raw/*11.45*/("""

"""),format.raw/*18.2*/("""

"""),format.raw/*26.2*/("""

"""),format.raw/*34.2*/("""

"""),format.raw/*42.2*/("""

"""),format.raw/*50.2*/("""

"""),format.raw/*54.2*/("""

"""),format.raw/*56.1*/("""<table class="table" id="topics-table">
    <thead>
    <tr><th>Topic</th>
        <th># Partitions</th>
        <th># Brokers</th>
        <th><span title="Percentage of cluster brokers having partitions from the topic">Brokers Spread %</span></th>
        <th><span title="Percentage of brokers having more partitions than the average">Brokers Skew %</span></th>
        <th><span title="Percentage of brokers having more partitions as leader than the average">Brokers Leader Skew %</span></th>
        <th># Replicas</th>
        <th><span title="Percentage of partitions having a missing replica">Under Replicated %</span></th>
        """),_display_(/*66.10*/if(displayTopicSize)/*66.30*/{_display_(Seq[Any](format.raw/*66.31*/("""
        """),format.raw/*67.9*/("""<th>Leader Size</th>
        """)))}),format.raw/*68.10*/("""
        """),_display_(/*69.10*/if(pollConsumers)/*69.27*/{_display_(Seq[Any](format.raw/*69.28*/("""
        """),format.raw/*70.9*/("""<th>Producer Message/Sec</th>
        <th>Summed Recent Offsets</th>
        """)))}),format.raw/*72.10*/("""
    """),format.raw/*73.5*/("""</tr>
    </thead>
    <tbody>
    """),_display_(/*76.6*/for( ((topic, topicIdentity), deleted) <- topics) yield /*76.55*/ {_display_(Seq[Any](format.raw/*76.57*/("""
      """),format.raw/*77.7*/("""<tr class=""""),_display_(/*77.19*/getReassignmentStatus(topic)),format.raw/*77.47*/("""">
          <td class=""""),_display_(/*78.23*/getDeletedLevel(deleted)),format.raw/*78.47*/(""""><a href=""""),_display_(/*78.59*/routes/*78.65*/.Topic.topic(cluster,topic)),format.raw/*78.92*/("""">"""),_display_(/*78.95*/topic),format.raw/*78.100*/("""</a></td>
          """),_display_(/*79.12*/topicIdentity/*79.25*/.map/*79.29*/{ ti =>_display_(Seq[Any](format.raw/*79.36*/(""" """),format.raw/*79.37*/("""<td>"""),_display_(/*79.42*/ti/*79.44*/.partitions),format.raw/*79.55*/("""</td>""")))}/*79.61*/.getOrElse/*79.71*/{_display_(Seq[Any](format.raw/*79.72*/("""<td> </td>""")))}),format.raw/*79.83*/("""
          """),_display_(/*80.12*/topicIdentity/*80.25*/.map/*80.29*/{ ti =>_display_(Seq[Any](format.raw/*80.36*/(""" """),format.raw/*80.37*/("""<td>"""),_display_(/*80.42*/ti/*80.44*/.topicBrokers),format.raw/*80.57*/("""</td>""")))}/*80.63*/.getOrElse/*80.73*/{_display_(Seq[Any](format.raw/*80.74*/("""<td> </td>""")))}),format.raw/*80.85*/("""
          """),_display_(/*81.12*/topicIdentity/*81.25*/.map/*81.29*/{ ti =>_display_(Seq[Any](format.raw/*81.36*/(""" """),format.raw/*81.37*/("""<td class=""""),_display_(/*81.49*/getBrokersSpreadLevel(ti.brokersSpreadPercentage)),format.raw/*81.98*/("""">"""),_display_(/*81.101*/ti/*81.103*/.brokersSpreadPercentage),format.raw/*81.127*/("""</td>""")))}/*81.133*/.getOrElse/*81.143*/{_display_(Seq[Any](format.raw/*81.144*/("""<td> </td>""")))}),format.raw/*81.155*/("""
          """),_display_(/*82.12*/topicIdentity/*82.25*/.map/*82.29*/{ ti =>_display_(Seq[Any](format.raw/*82.36*/(""" """),format.raw/*82.37*/("""<td class=""""),_display_(/*82.49*/getBrokersSkewLevel(ti.brokersSkewPercentage)),format.raw/*82.94*/("""">"""),_display_(/*82.97*/ti/*82.99*/.brokersSkewPercentage),format.raw/*82.121*/("""</td>""")))}/*82.127*/.getOrElse/*82.137*/{_display_(Seq[Any](format.raw/*82.138*/("""<td> </td>""")))}),format.raw/*82.149*/("""
          """),_display_(/*83.12*/topicIdentity/*83.25*/.map/*83.29*/{ ti =>_display_(Seq[Any](format.raw/*83.36*/(""" """),format.raw/*83.37*/("""<td class=""""),_display_(/*83.49*/getBrokersLeaderSkewLevel(ti.brokersLeaderSkewPercentage)),format.raw/*83.106*/("""">"""),_display_(/*83.109*/ti/*83.111*/.brokersLeaderSkewPercentage),format.raw/*83.139*/("""</td>""")))}/*83.145*/.getOrElse/*83.155*/{_display_(Seq[Any](format.raw/*83.156*/("""<td> </td>""")))}),format.raw/*83.167*/("""
          """),_display_(/*84.12*/topicIdentity/*84.25*/.map/*84.29*/{ ti =>_display_(Seq[Any](format.raw/*84.36*/(""" """),format.raw/*84.37*/("""<td>"""),_display_(/*84.42*/ti/*84.44*/.replicationFactor),format.raw/*84.62*/("""</td>""")))}/*84.68*/.getOrElse/*84.78*/{_display_(Seq[Any](format.raw/*84.79*/("""<td> </td>""")))}),format.raw/*84.90*/("""
          """),_display_(/*85.12*/topicIdentity/*85.25*/.map/*85.29*/{ ti =>_display_(Seq[Any](format.raw/*85.36*/(""" """),format.raw/*85.37*/("""<td class=""""),_display_(/*85.49*/getUnderReplicatedLevel(ti.underReplicatedPercentage)),format.raw/*85.102*/("""">"""),_display_(/*85.105*/ti/*85.107*/.underReplicatedPercentage),format.raw/*85.133*/("""</td>""")))}/*85.139*/.getOrElse/*85.149*/{_display_(Seq[Any](format.raw/*85.150*/("""<td> </td>""")))}),format.raw/*85.161*/("""
          """),_display_(/*86.12*/if(displayTopicSize)/*86.32*/{_display_(Seq[Any](format.raw/*86.33*/("""
          """),_display_(/*87.12*/topicIdentity/*87.25*/.map/*87.29*/{ ti =>_display_(Seq[Any](format.raw/*87.36*/(""" """),format.raw/*87.37*/("""<td>"""),_display_(/*87.42*/ti/*87.44*/.size),format.raw/*87.49*/("""</td>""")))}/*87.55*/.getOrElse/*87.65*/{_display_(Seq[Any](format.raw/*87.66*/("""<td> </td>""")))}),format.raw/*87.77*/("""
          """)))}),format.raw/*88.12*/("""
          """),_display_(/*89.12*/if(pollConsumers)/*89.29*/{_display_(Seq[Any](format.raw/*89.30*/("""
          """),_display_(/*90.12*/topicIdentity/*90.25*/.map/*90.29*/{ ti =>_display_(Seq[Any](format.raw/*90.36*/(""" """),format.raw/*90.37*/("""<td>"""),_display_(/*90.42*/ti/*90.44*/.producerRate),format.raw/*90.57*/("""</td>""")))}/*90.63*/.getOrElse/*90.73*/{_display_(Seq[Any](format.raw/*90.74*/("""<td> </td>""")))}),format.raw/*90.85*/("""
          """),_display_(/*91.12*/topicIdentity/*91.25*/.map/*91.29*/{ ti =>_display_(Seq[Any](format.raw/*91.36*/(""" """),format.raw/*91.37*/("""<td>"""),_display_(/*91.42*/ti/*91.44*/.summedTopicOffsets.formattedAsDecimal),format.raw/*91.82*/("""</td>""")))}/*91.88*/.getOrElse/*91.98*/{_display_(Seq[Any](format.raw/*91.99*/("""<td> </td>""")))}),format.raw/*91.110*/("""
          """)))}),format.raw/*92.12*/("""
      """),format.raw/*93.7*/("""</tr>
    """)))}),format.raw/*94.6*/("""
    """),format.raw/*95.5*/("""</tbody>
</table>
"""))
      }
    }
  }

  def render(cluster:String,topics:IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.TopicIdentity]], Boolean]],topicsUnderReassignment:IndexedSeq[String],pollConsumers:Boolean,displayTopicSize:Boolean,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topics,topicsUnderReassignment,pollConsumers,displayTopicSize)(messages)

  def f:((String,IndexedSeq[scala.Tuple2[scala.Tuple2[String, Option[kafka.manager.model.ActorModel.TopicIdentity]], Boolean]],IndexedSeq[String],Boolean,Boolean) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topics,topicsUnderReassignment,pollConsumers,displayTopicSize) => (messages) => apply(cluster,topics,topicsUnderReassignment,pollConsumers,displayTopicSize)(messages)

  def ref: this.type = this

}


}
}

/**/
object topicListContent extends topicListContent_Scope0.topicListContent_Scope1.topicListContent
              /*
                  -- GENERATED --
                  DATE: Thu May 24 21:33:03 NZST 2018
                  SOURCE: /home/locus/kafka-manager/app/views/topic/topicListContent.scala.html
                  HASH: 921c9d8176581e8bc0b2fcd0d81447fa56b60763
                  MATRIX: 803->157|1141->419|1165->434|1264->456|1296->462|1312->469|1327->475|1337->486|1358->498|1398->500|1423->516|1441->525|1465->534|1490->539|1520->560|1618->581|1650->587|1669->597|1684->603|1694->614|1733->644|1773->646|1799->663|1828->683|1868->685|1893->701|1911->710|1935->719|1960->724|1988->743|2086->764|2118->770|2137->780|2152->786|2162->797|2200->826|2240->828|2266->845|2295->865|2335->867|2360->883|2378->892|2402->901|2427->906|2461->931|2559->952|2591->958|2610->968|2625->974|2635->985|2673->1014|2713->1016|2739->1033|2768->1053|2808->1055|2833->1071|2851->1080|2875->1089|2900->1094|2932->1117|3030->1138|3062->1144|3081->1154|3096->1160|3106->1171|3144->1200|3184->1202|3210->1219|3239->1239|3279->1241|3304->1257|3322->1266|3346->1275|3371->1280|3401->1301|3497->1320|3529->1326|3581->1369|3621->1371|3649->1381|3662->1386|3685->1388|3727->416|3756->536|3785->721|3814->903|3843->1091|3872->1277|3901->1390|3930->1392|4598->2033|4627->2053|4666->2054|4702->2063|4763->2093|4800->2103|4826->2120|4865->2121|4901->2130|5010->2208|5042->2213|5104->2249|5169->2298|5209->2300|5243->2307|5282->2319|5331->2347|5383->2372|5428->2396|5467->2408|5482->2414|5530->2441|5560->2444|5587->2449|5635->2470|5657->2483|5670->2487|5715->2494|5744->2495|5776->2500|5787->2502|5819->2513|5844->2519|5863->2529|5902->2530|5944->2541|5983->2553|6005->2566|6018->2570|6063->2577|6092->2578|6124->2583|6135->2585|6169->2598|6194->2604|6213->2614|6252->2615|6294->2626|6333->2638|6355->2651|6368->2655|6413->2662|6442->2663|6481->2675|6551->2724|6582->2727|6594->2729|6640->2753|6666->2759|6686->2769|6726->2770|6769->2781|6808->2793|6830->2806|6843->2810|6888->2817|6917->2818|6956->2830|7022->2875|7052->2878|7063->2880|7107->2902|7133->2908|7153->2918|7193->2919|7236->2930|7275->2942|7297->2955|7310->2959|7355->2966|7384->2967|7423->2979|7502->3036|7533->3039|7545->3041|7595->3069|7621->3075|7641->3085|7681->3086|7724->3097|7763->3109|7785->3122|7798->3126|7843->3133|7872->3134|7904->3139|7915->3141|7954->3159|7979->3165|7998->3175|8037->3176|8079->3187|8118->3199|8140->3212|8153->3216|8198->3223|8227->3224|8266->3236|8341->3289|8372->3292|8384->3294|8432->3320|8458->3326|8478->3336|8518->3337|8561->3348|8600->3360|8629->3380|8668->3381|8707->3393|8729->3406|8742->3410|8787->3417|8816->3418|8848->3423|8859->3425|8885->3430|8910->3436|8929->3446|8968->3447|9010->3458|9053->3470|9092->3482|9118->3499|9157->3500|9196->3512|9218->3525|9231->3529|9276->3536|9305->3537|9337->3542|9348->3544|9382->3557|9407->3563|9426->3573|9465->3574|9507->3585|9546->3597|9568->3610|9581->3614|9626->3621|9655->3622|9687->3627|9698->3629|9757->3667|9782->3673|9801->3683|9840->3684|9883->3695|9926->3707|9960->3714|10001->3725|10033->3730
                  LINES: 23->6|32->13|32->13|34->13|35->14|35->14|35->14|35->15|35->15|35->15|35->16|35->16|35->17|36->20|36->20|38->20|39->21|39->21|39->21|39->22|39->22|39->22|39->23|39->23|39->23|39->24|39->24|39->25|40->28|40->28|42->28|43->29|43->29|43->29|43->30|43->30|43->30|43->31|43->31|43->31|43->32|43->32|43->33|44->36|44->36|46->36|47->37|47->37|47->37|47->38|47->38|47->38|47->39|47->39|47->39|47->40|47->40|47->41|48->44|48->44|50->44|51->45|51->45|51->45|51->46|51->46|51->46|51->47|51->47|51->47|51->48|51->48|51->49|52->52|52->52|54->52|55->53|55->53|55->53|55->53|55->53|55->53|57->11|59->18|61->26|63->34|65->42|67->50|69->54|71->56|81->66|81->66|81->66|82->67|83->68|84->69|84->69|84->69|85->70|87->72|88->73|91->76|91->76|91->76|92->77|92->77|92->77|93->78|93->78|93->78|93->78|93->78|93->78|93->78|94->79|94->79|94->79|94->79|94->79|94->79|94->79|94->79|94->79|94->79|94->79|94->79|95->80|95->80|95->80|95->80|95->80|95->80|95->80|95->80|95->80|95->80|95->80|95->80|96->81|96->81|96->81|96->81|96->81|96->81|96->81|96->81|96->81|96->81|96->81|96->81|96->81|96->81|97->82|97->82|97->82|97->82|97->82|97->82|97->82|97->82|97->82|97->82|97->82|97->82|97->82|97->82|98->83|98->83|98->83|98->83|98->83|98->83|98->83|98->83|98->83|98->83|98->83|98->83|98->83|98->83|99->84|99->84|99->84|99->84|99->84|99->84|99->84|99->84|99->84|99->84|99->84|99->84|100->85|100->85|100->85|100->85|100->85|100->85|100->85|100->85|100->85|100->85|100->85|100->85|100->85|100->85|101->86|101->86|101->86|102->87|102->87|102->87|102->87|102->87|102->87|102->87|102->87|102->87|102->87|102->87|102->87|103->88|104->89|104->89|104->89|105->90|105->90|105->90|105->90|105->90|105->90|105->90|105->90|105->90|105->90|105->90|105->90|106->91|106->91|106->91|106->91|106->91|106->91|106->91|106->91|106->91|106->91|106->91|106->91|107->92|108->93|109->94|110->95
                  -- GENERATED --
              */
          