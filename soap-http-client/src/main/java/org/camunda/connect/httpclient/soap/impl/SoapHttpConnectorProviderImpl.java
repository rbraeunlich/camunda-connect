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

package org.camunda.connect.httpclient.soap.impl;

import org.camunda.connect.httpclient.soap.SoapHttpConnector;
import org.camunda.connect.spi.ConnectorProvider;

public class SoapHttpConnectorProviderImpl implements ConnectorProvider {

  public String getConnectorId() {
    return SoapHttpConnector.ID;
  }

  public SoapHttpConnector createConnectorInstance() {
    return new SoapHttpConnectorImpl(SoapHttpConnector.ID);
  }

}
