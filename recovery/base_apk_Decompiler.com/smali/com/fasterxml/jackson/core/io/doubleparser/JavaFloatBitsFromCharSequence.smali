###### Class com.fasterxml.jackson.core.io.doubleparser.JavaFloatBitsFromCharSequence (com.fasterxml.jackson.core.io.doubleparser.JavaFloatBitsFromCharSequence)
.class final Lcom/fasterxml/jackson/core/io/doubleparser/JavaFloatBitsFromCharSequence;
.super Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 16
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;-><init>()V

    return-void
.end method


# virtual methods
.method final nan()J
    .registers 3

    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 22
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method

.method final negativeInfinity()J
    .registers 3

    const/high16 p0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 27
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method

.method final positiveInfinity()J
    .registers 3

    const/high16 p0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 32
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method

.method final valueOfFloatLiteral(Ljava/lang/CharSequence;IIZJIZI)J
    .registers 10

    .line 39
    invoke-static/range {p4 .. p9}, Lcom/fasterxml/jackson/core/io/doubleparser/FastFloatMath;->decFloatLiteralToFloat(ZJIZI)F

    move-result p0

    .line 40
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p4

    if-eqz p4, :cond_16

    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    :cond_16
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    return-wide p0
.end method

.method final valueOfHexLiteral(Ljava/lang/CharSequence;IIZJIZI)J
    .registers 10

    .line 47
    invoke-static/range {p4 .. p9}, Lcom/fasterxml/jackson/core/io/doubleparser/FastFloatMath;->hexFloatLiteralToFloat(ZJIZI)F

    move-result p0

    .line 48
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p4

    if-eqz p4, :cond_16

    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    :cond_16
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    return-wide p0
.end method
