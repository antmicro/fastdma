/*
Copyright (C) 2019-2023 Antmicro

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

SPDX-License-Identifier: Apache-2.0
*/

package DMAController.TestUtil

object WaitRange {
  def waitRange(init: Int, max: Int, cond: () => Boolean): Boolean = {
    for(i <- init to max) {
      if (cond()) return true
    }
    false
  }
}
