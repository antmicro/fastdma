/*
Copyright (C) 2019-2021 Antmicro

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

SPDX-License-Identifier: Apache-2.0
*/

package DMAController

import org.scalatest.{FlatSpec, Matchers}

class ControllerSpec extends FlatSpec with Matchers{
  behavior of "ControllerSpec"

  it should "perform 2D S2MM transfer with stride" in {
    chisel3.iotesters.Driver.execute(Array("--generate-vcd-output", "on"), () =>
      new DMATop) { dut =>
      new DMAFull(dut)
    } should be(true)
  }
}
