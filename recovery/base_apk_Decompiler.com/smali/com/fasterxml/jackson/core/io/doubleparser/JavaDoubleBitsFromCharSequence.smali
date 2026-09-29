###### Class com.fasterxml.jackson.core.io.doubleparser.JavaDoubleBitsFromCharSequence (com.fasterxml.jackson.core.io.doubleparser.JavaDoubleBitsFromCharSequence)
.class final Lcom/fasterxml/jackson/core/io/doubleparser/JavaDoubleBitsFromCharSequence;
.super Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 15
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;-><init>()V

    return-void
.end method


# virtual methods
.method final nan()J
    .registers 3

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    return-wide v0
.end method

.method final negativeInfinity()J
    .registers 3

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    return-wide v0
.end method

.method final positiveInfinity()J
    .registers 3

    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 31
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    return-wide v0
.end method

.method final valueOfFloatLiteral(Ljava/lang/CharSequence;IIZJIZI)J
    .registers 10

    .line 38
    invoke-static/range {p4 .. p9}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleMath;->tryDecFloatToDoubleTruncated(ZJIZI)D

    move-result-wide p4

    .line 40
    invoke-static {p4, p5}, Ljava/lang/Double;->isNaN(D)Z

    move-result p0

    if-eqz p0, :cond_16

    .line 41
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p4

    .line 40
    :cond_16
    invoke-static {p4, p5}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p0

    return-wide p0
.end method

.method final valueOfHexLiteral(Ljava/lang/CharSequence;IIZJIZI)J
    .registers 18

    move v0, p7

    int-to-long v3, v0

    move/from16 v0, p9

    int-to-long v6, v0

    move v0, p4

    move-wide v1, p5

    move/from16 v5, p8

    .line 49
    invoke-static/range {v0 .. v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleMath;->tryHexFloatToDoubleTruncated(ZJJZJ)D

    move-result-wide v0

    .line 51
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-eqz v2, :cond_1f

    .line 52
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 51
    :cond_1f
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    return-wide v0
.end method
