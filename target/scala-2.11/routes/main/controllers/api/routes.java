
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/locus/kafka-manager/conf/routes
// @DATE:Thu May 24 21:33:01 NZST 2018

package controllers.api;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.api.ReverseKafkaStateCheck KafkaStateCheck = new controllers.api.ReverseKafkaStateCheck(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.api.javascript.ReverseKafkaStateCheck KafkaStateCheck = new controllers.api.javascript.ReverseKafkaStateCheck(RoutesPrefix.byNamePrefix());
  }

}
