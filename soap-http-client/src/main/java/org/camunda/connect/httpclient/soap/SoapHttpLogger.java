/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.connect.httpclient.soap;

import org.camunda.commons.logging.BaseLogger;

public abstract class SoapHttpLogger extends BaseLogger {

  public static final String PROJECT_CODE = "SOAPC";

  public static SoapHttpConnectorLogger SOAP_CONNECTOR_LOGGER = createLogger(SoapHttpConnectorLogger.class, PROJECT_CODE, "org.camunda.bpm.connect.soap.httpclient.connector", "01");

}