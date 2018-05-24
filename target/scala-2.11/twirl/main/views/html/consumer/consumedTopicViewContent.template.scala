
package views.html.consumer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consumedTopicViewContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object consumedTopicViewContent_Scope1 {
import b3.vertical.fieldConstructor
import kafka.manager.utils.LongFormatted

class consumedTopicViewContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,String,kafka.manager.model.ActorModel.ConsumedTopicState,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(cluster:String, consumer: String, topic: String, state: kafka.manager.model.ActorModel.ConsumedTopicState
)(implicit messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*11.2*/getTopicCoverage/*11.18*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*11.39*/("""
    """),_display_(/*12.6*/percentage/*12.16*/ match/*12.22*/ {/*13.9*/case i if i <=  99 =>/*13.30*/ {_display_(Seq[Any](format.raw/*13.32*/("""danger""")))}/*14.9*/case i =>/*14.18*/ {}}),format.raw/*15.6*/("""
""")))};def /*18.2*/ifPartitionNotOwned/*18.21*/(owner: Option[String]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.48*/("""
    """),_display_(/*19.6*/owner/*19.11*/ match/*19.17*/ {/*20.5*/case None =>/*20.17*/ {_display_(Seq[Any](format.raw/*20.19*/("""warning""")))}/*21.5*/case Some(a) =>/*21.20*/ {}}),format.raw/*22.6*/("""
""")))};
Seq[Any](format.raw/*8.45*/("""


"""),format.raw/*16.2*/("""

"""),format.raw/*23.2*/("""

"""),format.raw/*25.1*/("""<div class="row">
    <div class="col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Topic Summary</h4></div>
            <table class="table">
                <tbody>
                <tr>
                    <td>Total Lag</td>
                    <td>"""),_display_(/*33.26*/state/*33.31*/.totalLag.map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*33.81*/("""</td>
                </tr>
                <tr>
                    <td>% of Partitions assigned to a consumer instance</td>
                    <td class=""""),_display_(/*37.33*/getTopicCoverage(state.percentageCovered)),format.raw/*37.74*/("""">"""),_display_(/*37.77*/state/*37.82*/.percentageCovered),format.raw/*37.100*/("""</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading"><h4><a href=""""),_display_(/*47.54*/routes/*47.60*/.Topic.topic(cluster,topic)),format.raw/*47.87*/("""">"""),_display_(/*47.90*/topic),format.raw/*47.95*/("""</a></h4></div>
            <table class="table">
                <thead>
                <tr><th>Partition</th><th>LogSize</th><th>Consumer Offset</th><th>Lag</th><th>Consumer Instance Owner</th></tr>
                </thead>
                <tbody>
                """),_display_(/*53.18*/for(tp:Int <- 0 until state.numPartitions) yield /*53.60*/ {_display_(Seq[Any](format.raw/*53.62*/("""
                """),format.raw/*54.17*/("""<tr>
                    <td>"""),_display_(/*55.26*/tp),format.raw/*55.28*/("""</td>
                    <td>"""),_display_(/*56.26*/state/*56.31*/.topicOffsets(tp).map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*56.89*/("""</td>
                    <td>"""),_display_(/*57.26*/state/*57.31*/.partitionOffsets.get(tp).map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*57.97*/("""</td>
                    <td>"""),_display_(/*58.26*/state/*58.31*/.partitionLag(tp).map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*58.89*/("""</td>
                    <td class=""""),_display_(/*59.33*/ifPartitionNotOwned(state.partitionOwners.get(tp))),format.raw/*59.83*/("""">"""),_display_(/*59.86*/state/*59.91*/.partitionOwners.get(tp).getOrElse("None")),format.raw/*59.133*/("""</td>
                </tr>
                """)))}),format.raw/*61.18*/("""
                """),format.raw/*62.17*/("""</tbody>
            </table>
        </div>
    </div>
</div>"""))
      }
    }
  }

  def render(cluster:String,consumer:String,topic:String,state:kafka.manager.model.ActorModel.ConsumedTopicState,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,consumer,topic,state)(messages)

  def f:((String,String,String,kafka.manager.model.ActorModel.ConsumedTopicState) => (play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,consumer,topic,state) => (messages) => apply(cluster,consumer,topic,state)(messages)

  def ref: this.type = this

}


}
}

/**/
object consumedTopicViewContent extends consumedTopicViewContent_Scope0.consumedTopicViewContent_Scope1.consumedTopicViewContent
              /*
                  -- GENERATED --
                  DATE: Thu May 24 21:33:02 NZST 2018
                  SOURCE: /home/locus/kafka-manager/app/views/consumer/consumedTopicViewContent.scala.html
                  HASH: 5b43a80b4c95929435b8f772051306879e462410
                  MATRIX: 785->194|1015->349|1040->365|1138->386|1170->392|1189->402|1204->408|1214->419|1244->440|1284->442|1309->458|1327->467|1351->476|1376->481|1404->500|1508->527|1540->533|1554->538|1569->544|1579->551|1600->563|1640->565|1666->578|1690->593|1714->602|1755->345|1785->478|1814->604|1843->606|2168->904|2182->909|2253->959|2438->1117|2500->1158|2530->1161|2544->1166|2584->1184|2859->1432|2874->1438|2922->1465|2952->1468|2978->1473|3273->1741|3331->1783|3371->1785|3416->1802|3473->1832|3496->1834|3554->1865|3568->1870|3647->1928|3705->1959|3719->1964|3806->2030|3864->2061|3878->2066|3957->2124|4022->2162|4093->2212|4123->2215|4137->2220|4201->2262|4277->2307|4322->2324
                  LINES: 24->7|29->11|29->11|31->11|32->12|32->12|32->12|32->13|32->13|32->13|32->14|32->14|32->15|33->18|33->18|35->18|36->19|36->19|36->19|36->20|36->20|36->20|36->21|36->21|36->22|38->8|41->16|43->23|45->25|53->33|53->33|53->33|57->37|57->37|57->37|57->37|57->37|67->47|67->47|67->47|67->47|67->47|73->53|73->53|73->53|74->54|75->55|75->55|76->56|76->56|76->56|77->57|77->57|77->57|78->58|78->58|78->58|79->59|79->59|79->59|79->59|79->59|81->61|82->62
                  -- GENERATED --
              */
          