import chisel3._
class add extends Module {
  val io = IO(new Bundle {
    val input = Input(UInt(32.W))
    val input2 = Input(UInt(32.W))
    val output = Output(UInt(32.W))
  })

  io.output := io.input + io.input2
}
class sub extends Module {
  val io = IO(new Bundle {
    val input = Input(UInt(32.W))
    val input2 = Input(UInt(32.W))
    val output = Output(UInt(32.W))
  })

  io.output := io.input - io.input2
}
class CombinedModule(a: add, b: sub) extends Module {
  val io = IO(new Bundle {
    val out1 = Output(UInt(32.W))
    val out2 = Output(UInt(32.W))
  })

  a.io.input := 1.U
  b.io.input := 9.U
  a.io.input2 := 20.U
  b.io.input2 := 7.U

  io.out1 := a.io.output
  io.out2 := b.io.output
}

