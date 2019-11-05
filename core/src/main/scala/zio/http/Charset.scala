/*
 * Copyright 2017-2019 John A. De Goes and the ZIO Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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

package zio.http

import java.nio.charset.{ StandardCharsets, Charset => JCharset }

final case class Charset private (value: JCharset) extends AnyVal {
  override def toString: String = value.displayName
}

object Charset {

  def apply(charSet: JCharset): Charset = Charset(charSet)

  val `ISO-8859-1` = Charset(StandardCharsets.ISO_8859_1)
  val `UTF-8`      = Charset(StandardCharsets.UTF_8)
  val `UTF-16`     = Charset(StandardCharsets.UTF_16)
  val `UTF-16BE`   = Charset(StandardCharsets.UTF_16BE)
  val `UTF-16LE`   = Charset(StandardCharsets.UTF_16LE)
  val `US-ASCII`   = Charset(StandardCharsets.US_ASCII)
}
