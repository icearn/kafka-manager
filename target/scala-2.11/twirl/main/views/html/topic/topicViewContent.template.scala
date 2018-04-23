
package views.html.topic

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object topicViewContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object topicViewContent_Scope1 {
import b3.vertical.fieldConstructor
import kafka.manager.model.ActorModel.ConsumerType
import models.form.ReassignPartitionOperation
import models.form.ReassignPartitionOperation._
import kafka.manager.utils.LongFormatted

class topicViewContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,kafka.manager.model.ActorModel.TopicIdentity,Iterable[scala.Tuple2[String, ConsumerType]],ReassignPartitionOperation,features.ApplicationFeatures,play.api.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(cluster:String
, topic: String
, topicIdentity: kafka.manager.model.ActorModel.TopicIdentity
, consumerList: Iterable[(String, ConsumerType)]
, reassignPartitionOperation: ReassignPartitionOperation
)(implicit af: features.ApplicationFeatures, messages: play.api.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*17.2*/getUnderReplicatedLevel/*17.25*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.46*/("""
    """),_display_(/*18.6*/percentage/*18.16*/ match/*18.22*/ {/*19.9*/case i if i > 50 =>/*19.28*/ {_display_(Seq[Any](format.raw/*19.30*/("""danger""")))}/*20.9*/case i if i > 0 =>/*20.27*/ {_display_(Seq[Any](format.raw/*20.29*/("""warning""")))}/*21.9*/case i =>/*21.18*/ {}}),format.raw/*22.6*/("""
""")))};def /*25.2*/getPreferredReplicasLevel/*25.27*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*25.48*/("""
    """),_display_(/*26.6*/percentage/*26.16*/ match/*26.22*/ {/*27.9*/case i if i > 50 && i<=75 =>/*27.37*/ {_display_(Seq[Any](format.raw/*27.39*/("""warning""")))}/*28.9*/case i if i <=  50 =>/*28.30*/ {_display_(Seq[Any](format.raw/*28.32*/("""danger""")))}/*29.9*/case i =>/*29.18*/ {}}),format.raw/*30.6*/("""
""")))};def /*33.2*/getBrokersSkewedLevel/*33.23*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*33.44*/("""
    """),_display_(/*34.6*/percentage/*34.16*/ match/*34.22*/ {/*35.9*/case i if i > 0 && i <= 33 =>/*35.38*/ {_display_(Seq[Any](format.raw/*35.40*/("""warning""")))}/*36.9*/case i if i >= 34 =>/*36.29*/ {_display_(Seq[Any](format.raw/*36.31*/("""danger""")))}/*37.9*/case i =>/*37.18*/ {}}),format.raw/*38.6*/("""
""")))};def /*41.2*/getBrokersLeaderSkewedLevel/*41.29*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*41.50*/("""
    """),_display_(/*42.6*/percentage/*42.16*/ match/*42.22*/ {/*43.9*/case i if i > 0 && i <= 33 =>/*43.38*/ {_display_(Seq[Any](format.raw/*43.40*/("""warning""")))}/*44.9*/case i if i >= 34 =>/*44.29*/ {_display_(Seq[Any](format.raw/*44.31*/("""danger""")))}/*45.9*/case i =>/*45.18*/ {}}),format.raw/*46.6*/("""
""")))};def /*49.2*/getBrokersSpreadLevel/*49.23*/(percentage: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*49.44*/("""
    """),_display_(/*50.6*/percentage/*50.16*/ match/*50.22*/ {/*51.9*/case i if i > 50 && i<=75 =>/*51.37*/ {_display_(Seq[Any](format.raw/*51.39*/("""warning""")))}/*52.9*/case i if i <=  50 =>/*52.30*/ {_display_(Seq[Any](format.raw/*52.32*/("""danger""")))}/*53.9*/case i =>/*53.18*/ {}}),format.raw/*54.6*/("""
""")))};def /*57.2*/getPartitionLeaderLevel/*57.25*/(leader: Int):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*57.42*/("""
    """),_display_(/*58.6*/leader/*58.12*/ match/*58.18*/ {/*59.9*/case i if i < 0 =>/*59.27*/ {_display_(Seq[Any](format.raw/*59.29*/("""danger""")))}/*60.9*/case i =>/*60.18*/ {}}),format.raw/*61.6*/("""
""")))};def /*64.2*/getIsUnderReplicatedLevel/*64.27*/(underReplicated: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*64.57*/("""
    """),_display_(/*65.6*/underReplicated/*65.21*/ match/*65.27*/ {/*66.9*/case true =>/*66.21*/ {_display_(Seq[Any](format.raw/*66.23*/("""warning""")))}/*67.9*/case false =>/*67.22*/ {}}),format.raw/*68.6*/("""
""")))};def /*71.2*/getIsPreferredLeaderLevel/*71.27*/(preferredReplica: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*71.58*/("""
    """),_display_(/*72.6*/preferredReplica/*72.22*/ match/*72.28*/ {/*73.9*/case false =>/*73.22*/ {_display_(Seq[Any](format.raw/*73.24*/("""warning""")))}/*74.9*/case true =>/*74.21*/ {}}),format.raw/*75.6*/("""
""")))};def /*78.2*/getBrokerIsSkewedLevel/*78.24*/(isSkewed: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*78.47*/("""
    """),_display_(/*79.6*/isSkewed/*79.14*/ match/*79.20*/ {/*80.9*/case true =>/*80.21*/ {_display_(Seq[Any](format.raw/*80.23*/("""warning""")))}/*81.9*/case false =>/*81.22*/ {}}),format.raw/*82.6*/("""
""")))};def /*85.2*/renderTopicMetrics/*85.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*85.24*/("""
    """),_display_(/*86.6*/if(topicIdentity.clusterContext.clusterFeatures.features(kafka.manager.features.KMJMXMetricsFeature))/*86.107*/ {_display_(Seq[Any](format.raw/*86.109*/("""
        """),_display_(/*87.10*/views/*87.15*/.html.common.brokerMetrics(topicIdentity.metrics)),format.raw/*87.64*/("""
    """)))}/*88.7*/else/*88.12*/{_display_(Seq[Any](format.raw/*88.13*/("""
        """),format.raw/*89.9*/("""<div class="alert alert-info" role="alert">
            Please enable JMX polling <a href=""""),_display_(/*90.49*/routes/*90.55*/.Cluster.updateCluster(cluster)),format.raw/*90.86*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*92.6*/("""
""")))};def /*95.2*/renderConsumerList/*95.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*95.24*/("""
    """),_display_(/*96.6*/if(topicIdentity.clusterContext.config.pollConsumers)/*96.59*/{_display_(Seq[Any](format.raw/*96.60*/("""
        """),format.raw/*97.9*/("""<table class="table">
            <tbody>
            """),_display_(/*99.14*/for((c:String, ct: ConsumerType) <- consumerList) yield /*99.63*/ {_display_(Seq[Any](format.raw/*99.65*/("""
                """),format.raw/*100.17*/("""<tr>
                    <td><a href=""""),_display_(/*101.35*/routes/*101.41*/.Consumer.consumerAndTopic(cluster,c,topic, ct.toString)),format.raw/*101.97*/("""">"""),_display_(/*101.100*/c),format.raw/*101.101*/("""</a></td>
                    <td>"""),_display_(/*102.26*/ct/*102.28*/.toString),format.raw/*102.37*/("""</td>
                </tr>
            """)))}),format.raw/*104.14*/("""
            """),format.raw/*105.13*/("""</tbody>
        </table>
    """)))}/*107.7*/else/*107.12*/{_display_(Seq[Any](format.raw/*107.13*/("""
        """),format.raw/*108.9*/("""<div class="alert alert-info" role="alert">
            Please enable consumer polling <a href=""""),_display_(/*109.54*/routes/*109.60*/.Cluster.updateCluster(cluster)),format.raw/*109.91*/("""" class="alert-link">here</a>.
        </div>
    """)))}),format.raw/*111.6*/("""
""")))};
Seq[Any](format.raw/*15.79*/("""

"""),format.raw/*23.2*/("""

"""),format.raw/*31.2*/("""

"""),format.raw/*39.2*/("""

"""),format.raw/*47.2*/("""

"""),format.raw/*55.2*/("""

"""),format.raw/*62.2*/("""

"""),format.raw/*69.2*/("""

"""),format.raw/*76.2*/("""

"""),format.raw/*83.2*/("""

"""),format.raw/*93.2*/("""

"""),format.raw/*112.2*/("""


"""),format.raw/*115.1*/("""<div class="row">
    <div class="col-md-5">
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Topic Summary</h4></div>
            <table class="table">
                <tbody>
                <tr>
                    <td>Replication</td>
                    <td>"""),_display_(/*123.26*/topicIdentity/*123.39*/.replicationFactor),format.raw/*123.57*/("""</td>
                <tr>
                    <td>Number of Partitions</td>
                    <td>"""),_display_(/*126.26*/topicIdentity/*126.39*/.partitions),format.raw/*126.50*/("""</td>
                </tr>
                <tr>
                    <td><span title="Represents the theoretical size of the topic">Sum of partition offsets</span></td>
                    <td>"""),_display_(/*130.26*/topicIdentity/*130.39*/.summedTopicOffsets.formattedAsDecimal),format.raw/*130.77*/("""</td>
                </tr>
                <tr>
                    <td>Total number of Brokers</td>
                    <td>"""),_display_(/*134.26*/topicIdentity/*134.39*/.numBrokers),format.raw/*134.50*/("""</td>
                </tr>
                <tr>
                    <td>Number of Brokers for Topic</td>
                    <td>"""),_display_(/*138.26*/topicIdentity/*138.39*/.topicBrokers),format.raw/*138.52*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of replicas leader being preferred (first in the list of replicas)">Preferred Replicas %</td>
                    <td class=""""),_display_(/*142.33*/getPreferredReplicasLevel(topicIdentity.preferredReplicasPercentage)),format.raw/*142.101*/("""">
                        """),_display_(/*143.26*/topicIdentity/*143.39*/.preferredReplicasPercentage),format.raw/*143.67*/("""
                    """),format.raw/*144.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of brokers having more partitions than the average">Brokers Skewed %</span></td>
                    <td class=""""),_display_(/*148.33*/getBrokersSkewedLevel(topicIdentity.brokersSkewPercentage)),format.raw/*148.91*/("""">
                        """),_display_(/*149.26*/topicIdentity/*149.39*/.brokersSkewPercentage),format.raw/*149.61*/("""
                    """),format.raw/*150.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of brokers having more partitions as leader than the average">Brokers Leader Skewed %</span></td>
                    <td class=""""),_display_(/*154.33*/getBrokersLeaderSkewedLevel(topicIdentity.brokersLeaderSkewPercentage)),format.raw/*154.103*/("""">
                        """),_display_(/*155.26*/topicIdentity/*155.39*/.brokersLeaderSkewPercentage),format.raw/*155.67*/("""
                    """),format.raw/*156.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of cluster brokers having partitions from the topic">Brokers Spread %</span></td>
                    <td class=""""),_display_(/*160.33*/getBrokersSpreadLevel(topicIdentity.brokersSpreadPercentage)),format.raw/*160.93*/("""">
                        """),_display_(/*161.26*/topicIdentity/*161.39*/.brokersSpreadPercentage),format.raw/*161.63*/("""
                    """),format.raw/*162.21*/("""</td>
                </tr>
                <tr>
                    <td><span title="Percentage of partitions having a missing replica">Under-replicated %</span></td>
                    <td class=""""),_display_(/*166.33*/getUnderReplicatedLevel(topicIdentity.underReplicatedPercentage)),format.raw/*166.97*/("""">
                        """),_display_(/*167.26*/topicIdentity/*167.39*/.underReplicatedPercentage),format.raw/*167.65*/("""
                    """),format.raw/*168.21*/("""</td>
                </tr>
                """),_display_(/*170.18*/if(topicIdentity.clusterContext.config.jmxEnabled && topicIdentity.clusterContext.config.displaySizeEnabled)/*170.126*/{_display_(Seq[Any](format.raw/*170.127*/("""
                """),format.raw/*171.17*/("""<tr>
                    <td>Leader Size</td>
                    <td>"""),_display_(/*173.26*/topicIdentity/*173.39*/.size),format.raw/*173.44*/("""</td>
                </tr>
                """)))}),format.raw/*175.18*/("""
                """),format.raw/*176.17*/("""</tbody>
            </table>
            """),_display_(/*178.14*/if(!topicIdentity.config.isEmpty)/*178.47*/ {_display_(Seq[Any](format.raw/*178.49*/("""
            """),format.raw/*179.13*/("""<table class="table">
                <thead>
                <th>Config</th><th>Value</th>
                </thead>
                <tbody>
                """),_display_(/*184.18*/for( (k,v) <- topicIdentity.config) yield /*184.53*/ {_display_(Seq[Any](format.raw/*184.55*/("""
                """),format.raw/*185.17*/("""<tr>
                    <td>"""),_display_(/*186.26*/k),format.raw/*186.27*/("""</td>
                    <td>"""),_display_(/*187.26*/v),format.raw/*187.27*/("""</td>
                </tr>
                """)))}),format.raw/*189.18*/("""
                """),format.raw/*190.17*/("""</tbody>
            </table>
            """)))}),format.raw/*192.14*/("""
        """),format.raw/*193.9*/("""</div>
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Metrics</h4></div>
            """),_display_(/*196.14*/renderTopicMetrics),format.raw/*196.32*/("""
        """),format.raw/*197.9*/("""</div>
    </div>
    <div class="col-md-7">
        """),_display_(/*200.10*/features/*200.18*/.app(features.KMTopicManagerFeature)/*200.54*/ {_display_(Seq[Any](format.raw/*200.56*/("""
        """),format.raw/*201.9*/("""<div class="panel panel-default">
            <div class="panel-heading"><h4>Operations</h4></div>
            <table class="table">
                <tbody>
                <tr>
                    """),_display_(/*206.22*/if(topicIdentity.clusterContext.clusterFeatures.features(kafka.manager.features.KMDeleteTopicFeature))/*206.124*/ {_display_(Seq[Any](format.raw/*206.126*/("""
                    """),format.raw/*207.21*/("""<td>
                        <a href=""""),_display_(/*208.35*/routes/*208.41*/.Topic.confirmDeleteTopic(cluster,topic)),format.raw/*208.81*/("""" class='btn btn-primary btn-block'>Delete Topic</a>
                    </td>
                    """)))}),format.raw/*210.22*/("""
                    """),_display_(/*211.22*/features/*211.30*/.app(features.KMReassignPartitionsFeature)/*211.72*/ {_display_(Seq[Any](format.raw/*211.74*/("""
                    """),format.raw/*212.21*/("""<td>
                        """),_display_(/*213.26*/b3/*213.28*/.form(routes.ReassignPartitions.handleOperation(cluster,topic))/*213.91*/ {_display_(Seq[Any](format.raw/*213.93*/("""
                            """),_display_(/*214.30*/reassignPartitionOperation/*214.56*/ match/*214.62*/ {/*215.33*/case ForceRunAssignment =>/*215.59*/ {_display_(Seq[Any](format.raw/*215.61*/("""
                                    """),format.raw/*216.37*/("""<fieldset>
                                        <input type="hidden" name="operation" value="force">
                                        <input type="hidden" name="brokers" value=""""),_display_(/*218.85*/Seq()),format.raw/*218.90*/("""">
                                        """),_display_(/*219.42*/b3/*219.44*/.submit('class -> "btn btn-primary btn-block")/*219.90*/{_display_(Seq[Any](format.raw/*219.91*/(""" """),format.raw/*219.92*/("""Force Reassign Partitions """)))}),format.raw/*219.119*/("""
                                    """),format.raw/*220.37*/("""</fieldset>
                                """)))}/*222.33*/case _ =>/*222.42*/ {_display_(Seq[Any](format.raw/*222.44*/("""
                                    """),format.raw/*223.37*/("""<fieldset>
                                        <input type="hidden" name="operation" value="run">
                                        <input type="hidden" name="brokers" value=""""),_display_(/*225.85*/Seq()),format.raw/*225.90*/("""">
                                        """),_display_(/*226.42*/b3/*226.44*/.submit('class -> "btn btn-primary btn-block")/*226.90*/{_display_(Seq[Any](format.raw/*226.91*/(""" """),format.raw/*226.92*/("""Reassign Partitions """)))}),format.raw/*226.113*/("""
                                    """),format.raw/*227.37*/("""</fieldset>
                                """)))}}),format.raw/*229.30*/("""
                        """)))}),format.raw/*230.26*/("""
                    """),format.raw/*231.21*/("""</td>
                    <td>
                        <a href=""""),_display_(/*233.35*/routes/*233.41*/.ReassignPartitions.confirmAssignment(cluster,topic)),format.raw/*233.93*/("""" class="submit-button btn btn-primary" role="button">Generate Partition Assignments</a>
                    </td>
                    """)))}),format.raw/*235.22*/("""
                """),format.raw/*236.17*/("""</tr>
                <tr>
                    <td>
                        <a href=""""),_display_(/*239.35*/routes/*239.41*/.Topic.addPartitions(cluster,topic)),format.raw/*239.76*/("""" class="submit-button btn btn-primary" role="button">Add Partitions</a>
                    </td>
                    <td>
                        <a href=""""),_display_(/*242.35*/routes/*242.41*/.Topic.updateConfig(cluster,topic)),format.raw/*242.75*/("""" class="submit-button btn btn-primary" role="button">Update Config</a>
                    </td>
                    """),_display_(/*244.22*/features/*244.30*/.app(features.KMReassignPartitionsFeature)/*244.72*/ {_display_(Seq[Any](format.raw/*244.74*/("""
                    """),format.raw/*245.21*/("""<td>
                        <a href=""""),_display_(/*246.35*/routes/*246.41*/.ReassignPartitions.manualAssignments(cluster, topic)),format.raw/*246.94*/("""" class="submit-button btn btn-primary" role="button">Manual Partition Assignments</a>
                    </td>
                    """)))}),format.raw/*248.22*/("""
                """),format.raw/*249.17*/("""</tr>
                </tbody>
            </table>
        </div>
        """)))}),format.raw/*253.10*/("""
        """),format.raw/*254.9*/("""<div class="panel panel-default">
            <div class="panel-heading"><h4>Partitions by Broker</h4></div>
            <table class="table" style="table-layout: fixed; width: 100%">
                <thead>
                <tr><th>Broker</th><th># of Partitions</th><th># as Leader</th><th>Partitions</th><th><span title="Broker has more partitions than the average">Skewed?</span></th><th><span title="Broker has more partitions as leaders than the average">Leader Skewed?</span></th></tr>
                </thead>
                <tbody>
                """),_display_(/*261.18*/for(btp <- topicIdentity.partitionsByBroker) yield /*261.62*/ {_display_(Seq[Any](format.raw/*261.64*/("""
                """),format.raw/*262.17*/("""<tr>
                    <td><a href=""""),_display_(/*263.35*/routes/*263.41*/.Cluster.broker(cluster,btp.id)),format.raw/*263.72*/("""">"""),_display_(/*263.75*/btp/*263.78*/.id),format.raw/*263.81*/("""</a></td>
                    <td>"""),_display_(/*264.26*/btp/*264.29*/.partitions.size),format.raw/*264.45*/("""</td>
                    <td>"""),_display_(/*265.26*/btp/*265.29*/.leaders.size),format.raw/*265.42*/("""</td>
                    <td style="word-wrap: break-word">"""),_display_(/*266.56*/btp/*266.59*/.partitions.mkString("(",",",")")),format.raw/*266.92*/("""</td>
                    <td class=""""),_display_(/*267.33*/getBrokerIsSkewedLevel(btp.isSkewed)),format.raw/*267.69*/("""">
                        """),_display_(/*268.26*/btp/*268.29*/.isSkewed),format.raw/*268.38*/("""
                    """),format.raw/*269.21*/("""</td>
                    <td class=""""),_display_(/*270.33*/getBrokerIsSkewedLevel(btp.isLeaderSkewed)),format.raw/*270.75*/("""">
                        """),_display_(/*271.26*/btp/*271.29*/.isLeaderSkewed),format.raw/*271.44*/("""
                    """),format.raw/*272.21*/("""</td>
                </tr>
                """)))}),format.raw/*274.18*/("""
                """),format.raw/*275.17*/("""</tbody>
            </table>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Consumers consuming from this topic</h4></div>
            """),_display_(/*280.14*/renderConsumerList),format.raw/*280.32*/("""
        """),format.raw/*281.9*/("""</div>
    </div>
</div>
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading"><h4>Partition Information</h4></div>
            <table class="table">
                <thead>
                <tr>
                    <th>Partition</th>
                    <th>Latest Offset</th>
                    <th>Leader</th>
                    <th>Replicas</th>
                    <th>In Sync Replicas</th>
                    <th>Preferred Leader?</th>
                    <th>Under Replicated?</th>
                    """),_display_(/*298.22*/if(topicIdentity.clusterContext.config.jmxEnabled && topicIdentity.clusterContext.config.displaySizeEnabled)/*298.130*/{_display_(Seq[Any](format.raw/*298.131*/("""
                    """),format.raw/*299.21*/("""<th>Leader Size</th>
                    """)))}),format.raw/*300.22*/("""
                """),format.raw/*301.17*/("""</tr>
                </thead>
                <tbody>
                """),_display_(/*304.18*/for((_,tpi) <- topicIdentity.partitionsIdentity.toIndexedSeq.sortBy(_._2.partNum)) yield /*304.100*/ {_display_(Seq[Any](format.raw/*304.102*/("""
                """),format.raw/*305.17*/("""<tr>
                    <td>"""),_display_(/*306.26*/tpi/*306.29*/.partNum),format.raw/*306.37*/("""</td>
                    <td>"""),_display_(/*307.26*/tpi/*307.29*/.latestOffset.map(_.formattedAsDecimal).getOrElse(" ")),format.raw/*307.83*/("""</td>
                    <td class=""""),_display_(/*308.33*/getPartitionLeaderLevel(tpi.leader)),format.raw/*308.68*/("""">
                        <a href=""""),_display_(/*309.35*/routes/*309.41*/.Cluster.broker(cluster,tpi.leader)),format.raw/*309.76*/("""">"""),_display_(/*309.79*/tpi/*309.82*/.leader),format.raw/*309.89*/("""</a>
                    </td>
                    <td style="word-wrap: break-word">"""),_display_(/*311.56*/tpi/*311.59*/.replicas.mkString("(", ",", ")")),format.raw/*311.92*/("""</td>
                    <td style="word-wrap: break-word">"""),_display_(/*312.56*/tpi/*312.59*/.isr.mkString("(", ",", ")")),format.raw/*312.87*/("""</td>
                    <td class=""""),_display_(/*313.33*/getIsPreferredLeaderLevel(tpi.isPreferredLeader)),format.raw/*313.81*/("""">
                        """),_display_(/*314.26*/tpi/*314.29*/.isPreferredLeader),format.raw/*314.47*/("""
                    """),format.raw/*315.21*/("""</td>
                    <td class=""""),_display_(/*316.33*/getIsUnderReplicatedLevel(tpi.isUnderReplicated)),format.raw/*316.81*/("""">
                        """),_display_(/*317.26*/tpi/*317.29*/.isUnderReplicated),format.raw/*317.47*/("""
                    """),format.raw/*318.21*/("""</td>
                    """),_display_(/*319.22*/if(topicIdentity.clusterContext.config.jmxEnabled && topicIdentity.clusterContext.config.displaySizeEnabled)/*319.130*/{_display_(Seq[Any](format.raw/*319.131*/("""
                    """),format.raw/*320.21*/("""<td>"""),_display_(/*320.26*/tpi/*320.29*/.size),format.raw/*320.34*/("""</td>
                    """)))}),format.raw/*321.22*/("""
                """),format.raw/*322.17*/("""</tr>
                """)))}),format.raw/*323.18*/("""
                """),format.raw/*324.17*/("""</tbody>
            </table>
        </div>
    </div>
</div>
"""))
      }
    }
  }

  def render(cluster:String,topic:String,topicIdentity:kafka.manager.model.ActorModel.TopicIdentity,consumerList:Iterable[scala.Tuple2[String, ConsumerType]],reassignPartitionOperation:ReassignPartitionOperation,af:features.ApplicationFeatures,messages:play.api.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(cluster,topic,topicIdentity,consumerList,reassignPartitionOperation)(af,messages)

  def f:((String,String,kafka.manager.model.ActorModel.TopicIdentity,Iterable[scala.Tuple2[String, ConsumerType]],ReassignPartitionOperation) => (features.ApplicationFeatures,play.api.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (cluster,topic,topicIdentity,consumerList,reassignPartitionOperation) => (af,messages) => apply(cluster,topic,topicIdentity,consumerList,reassignPartitionOperation)(af,messages)

  def ref: this.type = this

}


}
}

/**/
object topicViewContent extends topicViewContent_Scope0.topicViewContent_Scope1.topicViewContent
              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 23:08:33 NZST 2018
                  SOURCE: /home/locus/kafka-manager/app/views/topic/topicViewContent.scala.html
                  HASH: d301714f526a8e927da1c21104759353bfdc6c21
                  MATRIX: 993->342|1350->623|1382->646|1480->667|1512->673|1531->683|1546->689|1556->700|1584->719|1624->721|1649->737|1676->755|1716->757|1742->774|1760->783|1784->792|1809->797|1843->822|1941->843|1973->849|1992->859|2007->865|2017->876|2054->904|2094->906|2120->923|2150->944|2190->946|2215->962|2233->971|2257->980|2282->985|2312->1006|2410->1027|2442->1033|2461->1043|2476->1049|2486->1060|2524->1089|2564->1091|2590->1108|2619->1128|2659->1130|2684->1146|2702->1155|2726->1164|2751->1169|2787->1196|2885->1217|2917->1223|2936->1233|2951->1239|2961->1250|2999->1279|3039->1281|3065->1298|3094->1318|3134->1320|3159->1336|3177->1345|3201->1354|3226->1359|3256->1380|3354->1401|3386->1407|3405->1417|3420->1423|3430->1434|3467->1462|3507->1464|3533->1481|3563->1502|3603->1504|3628->1520|3646->1529|3670->1538|3695->1543|3727->1566|3821->1583|3853->1589|3868->1595|3883->1601|3893->1612|3920->1630|3960->1632|3985->1648|4003->1657|4027->1666|4052->1671|4086->1696|4193->1726|4225->1732|4249->1747|4264->1753|4274->1764|4295->1776|4335->1778|4361->1795|4383->1808|4407->1817|4432->1822|4466->1847|4574->1878|4606->1884|4631->1900|4646->1906|4656->1917|4678->1930|4718->1932|4744->1949|4765->1961|4789->1970|4814->1975|4845->1997|4945->2020|4977->2026|4994->2034|5009->2040|5019->2051|5040->2063|5080->2065|5106->2082|5128->2095|5152->2104|5177->2109|5204->2127|5285->2131|5317->2137|5428->2238|5469->2240|5506->2250|5520->2255|5590->2304|5614->2311|5627->2316|5666->2317|5702->2326|5821->2418|5836->2424|5888->2455|5969->2506|5994->2511|6021->2529|6102->2533|6134->2539|6196->2592|6235->2593|6271->2602|6353->2657|6418->2706|6458->2708|6504->2725|6571->2764|6587->2770|6665->2826|6697->2829|6721->2830|6784->2865|6796->2867|6827->2876|6900->2917|6942->2930|6992->2962|7006->2967|7046->2968|7083->2977|7208->3074|7224->3080|7277->3111|7359->3162|7401->620|7430->794|7459->982|7488->1166|7517->1356|7546->1540|7575->1668|7604->1819|7633->1972|7662->2106|7691->2508|7721->3164|7752->3167|8080->3467|8103->3480|8143->3498|8273->3600|8296->3613|8329->3624|8551->3818|8574->3831|8634->3869|8789->3996|8812->4009|8845->4020|9004->4151|9027->4164|9062->4177|9313->4400|9404->4468|9460->4496|9483->4509|9533->4537|9583->4558|9821->4768|9901->4826|9957->4854|9980->4867|10024->4889|10074->4910|10329->5137|10422->5207|10478->5235|10501->5248|10551->5276|10601->5297|10840->5508|10922->5568|10978->5596|11001->5609|11047->5633|11097->5654|11325->5854|11411->5918|11467->5946|11490->5959|11538->5985|11588->6006|11661->6051|11780->6159|11821->6160|11867->6177|11966->6248|11989->6261|12016->6266|12093->6311|12139->6328|12210->6371|12253->6404|12294->6406|12336->6419|12522->6577|12574->6612|12615->6614|12661->6631|12719->6661|12742->6662|12801->6693|12824->6694|12901->6739|12947->6756|13022->6799|13059->6808|13211->6932|13251->6950|13288->6959|13370->7013|13388->7021|13434->7057|13475->7059|13512->7068|13739->7267|13852->7369|13894->7371|13944->7392|14011->7431|14027->7437|14089->7477|14221->7577|14271->7599|14289->7607|14341->7649|14382->7651|14432->7672|14490->7702|14502->7704|14575->7767|14616->7769|14674->7799|14710->7825|14726->7831|14738->7866|14774->7892|14815->7894|14881->7931|15097->8119|15124->8124|15196->8168|15208->8170|15264->8216|15304->8217|15334->8218|15394->8245|15460->8282|15525->8360|15544->8369|15585->8371|15651->8408|15865->8594|15892->8599|15964->8643|15976->8645|16032->8691|16072->8692|16102->8693|16156->8714|16222->8751|16300->8826|16358->8852|16408->8873|16501->8938|16517->8944|16591->8996|16759->9132|16805->9149|16919->9235|16935->9241|16992->9276|17178->9434|17194->9440|17250->9474|17397->9593|17415->9601|17467->9643|17508->9645|17558->9666|17625->9705|17641->9711|17716->9764|17882->9898|17928->9915|18036->9991|18073->10000|18659->10558|18720->10602|18761->10604|18807->10621|18874->10660|18890->10666|18943->10697|18974->10700|18987->10703|19012->10706|19075->10741|19088->10744|19126->10760|19185->10791|19198->10794|19233->10807|19322->10868|19335->10871|19390->10904|19456->10942|19514->10978|19570->11006|19583->11009|19614->11018|19664->11039|19730->11077|19794->11119|19850->11147|19863->11150|19900->11165|19950->11186|20027->11231|20073->11248|20291->11438|20331->11456|20368->11465|20981->12050|21100->12158|21141->12159|21191->12180|21265->12222|21311->12239|21411->12311|21511->12393|21553->12395|21599->12412|21657->12442|21670->12445|21700->12453|21759->12484|21772->12487|21848->12541|21914->12579|21971->12614|22036->12651|22052->12657|22109->12692|22140->12695|22153->12698|22182->12705|22296->12791|22309->12794|22364->12827|22453->12888|22466->12891|22516->12919|22582->12957|22652->13005|22708->13033|22721->13036|22761->13054|22811->13075|22877->13113|22947->13161|23003->13189|23016->13192|23056->13210|23106->13231|23161->13258|23280->13366|23321->13367|23371->13388|23404->13393|23417->13396|23444->13401|23503->13428|23549->13445|23604->13468|23650->13485
                  LINES: 27->10|36->17|36->17|38->17|39->18|39->18|39->18|39->19|39->19|39->19|39->20|39->20|39->20|39->21|39->21|39->22|40->25|40->25|42->25|43->26|43->26|43->26|43->27|43->27|43->27|43->28|43->28|43->28|43->29|43->29|43->30|44->33|44->33|46->33|47->34|47->34|47->34|47->35|47->35|47->35|47->36|47->36|47->36|47->37|47->37|47->38|48->41|48->41|50->41|51->42|51->42|51->42|51->43|51->43|51->43|51->44|51->44|51->44|51->45|51->45|51->46|52->49|52->49|54->49|55->50|55->50|55->50|55->51|55->51|55->51|55->52|55->52|55->52|55->53|55->53|55->54|56->57|56->57|58->57|59->58|59->58|59->58|59->59|59->59|59->59|59->60|59->60|59->61|60->64|60->64|62->64|63->65|63->65|63->65|63->66|63->66|63->66|63->67|63->67|63->68|64->71|64->71|66->71|67->72|67->72|67->72|67->73|67->73|67->73|67->74|67->74|67->75|68->78|68->78|70->78|71->79|71->79|71->79|71->80|71->80|71->80|71->81|71->81|71->82|72->85|72->85|74->85|75->86|75->86|75->86|76->87|76->87|76->87|77->88|77->88|77->88|78->89|79->90|79->90|79->90|81->92|82->95|82->95|84->95|85->96|85->96|85->96|86->97|88->99|88->99|88->99|89->100|90->101|90->101|90->101|90->101|90->101|91->102|91->102|91->102|93->104|94->105|96->107|96->107|96->107|97->108|98->109|98->109|98->109|100->111|102->15|104->23|106->31|108->39|110->47|112->55|114->62|116->69|118->76|120->83|122->93|124->112|127->115|135->123|135->123|135->123|138->126|138->126|138->126|142->130|142->130|142->130|146->134|146->134|146->134|150->138|150->138|150->138|154->142|154->142|155->143|155->143|155->143|156->144|160->148|160->148|161->149|161->149|161->149|162->150|166->154|166->154|167->155|167->155|167->155|168->156|172->160|172->160|173->161|173->161|173->161|174->162|178->166|178->166|179->167|179->167|179->167|180->168|182->170|182->170|182->170|183->171|185->173|185->173|185->173|187->175|188->176|190->178|190->178|190->178|191->179|196->184|196->184|196->184|197->185|198->186|198->186|199->187|199->187|201->189|202->190|204->192|205->193|208->196|208->196|209->197|212->200|212->200|212->200|212->200|213->201|218->206|218->206|218->206|219->207|220->208|220->208|220->208|222->210|223->211|223->211|223->211|223->211|224->212|225->213|225->213|225->213|225->213|226->214|226->214|226->214|226->215|226->215|226->215|227->216|229->218|229->218|230->219|230->219|230->219|230->219|230->219|230->219|231->220|232->222|232->222|232->222|233->223|235->225|235->225|236->226|236->226|236->226|236->226|236->226|236->226|237->227|238->229|239->230|240->231|242->233|242->233|242->233|244->235|245->236|248->239|248->239|248->239|251->242|251->242|251->242|253->244|253->244|253->244|253->244|254->245|255->246|255->246|255->246|257->248|258->249|262->253|263->254|270->261|270->261|270->261|271->262|272->263|272->263|272->263|272->263|272->263|272->263|273->264|273->264|273->264|274->265|274->265|274->265|275->266|275->266|275->266|276->267|276->267|277->268|277->268|277->268|278->269|279->270|279->270|280->271|280->271|280->271|281->272|283->274|284->275|289->280|289->280|290->281|307->298|307->298|307->298|308->299|309->300|310->301|313->304|313->304|313->304|314->305|315->306|315->306|315->306|316->307|316->307|316->307|317->308|317->308|318->309|318->309|318->309|318->309|318->309|318->309|320->311|320->311|320->311|321->312|321->312|321->312|322->313|322->313|323->314|323->314|323->314|324->315|325->316|325->316|326->317|326->317|326->317|327->318|328->319|328->319|328->319|329->320|329->320|329->320|329->320|330->321|331->322|332->323|333->324
                  -- GENERATED --
              */
          