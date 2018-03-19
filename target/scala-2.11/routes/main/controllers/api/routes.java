
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/locus/kafka-manager/conf/routes
// @DATE:Mon Mar 19 23:10:11 NZDT 2018

package controllers.api;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.api.ReverseKafkaStateCheck KafkaStateCheck = new controllers.api.ReverseKafkaStateCheck(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.api.javascript.ReverseKafkaStateCheck KafkaStateCheck = new controllers.api.javascript.ReverseKafkaStateCheck(RoutesPrefix.byNamePrefix());
  }

}
