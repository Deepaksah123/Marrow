###### Class com.fasterxml.jackson.core.io.doubleparser.FastFloatMath (com.fasterxml.jackson.core.io.doubleparser.FastFloatMath)
.class Lcom/fasterxml/jackson/core/io/doubleparser/FastFloatMath;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final FLOAT_POWER_OF_TEN:[F


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const/16 v0, 0xb

    .line 35
    new-array v0, v0, [F

    fill-array-data v0, :array_a

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FastFloatMath;->FLOAT_POWER_OF_TEN:[F

    return-void

    :array_a
    .array-data 4
        0x3f800000    # 1.0f
        0x41200000    # 10.0f
        0x42c80000    # 100.0f
        0x447a0000    # 1000.0f
        0x461c4000    # 10000.0f
        0x47c35000    # 100000.0f
        0x49742400    # 1000000.0f
        0x4b189680    # 1.0E7f
        0x4cbebc20    # 1.0E8f
        0x4e6e6b28    # 1.0E9f
        0x501502f9    # 1.0E10f
    .end array-data
.end method

.method static decFloatLiteralToFloat(ZJIZI)F
    .registers 10

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    const/16 v0, 0x26

    const/high16 v1, 0x7fc00000    # Float.NaN

    const/16 v2, -0x2d

    if-eqz p4, :cond_2b

    if-gt v2, p5, :cond_2a

    if-gt p5, v0, :cond_2a

    .line 61
    invoke-static {p0, p1, p2, p5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastFloatMath;->tryDecToFloatWithFastAlgorithm(ZJI)F

    move-result p3

    const-wide/16 v2, 0x1

    add-long/2addr p1, v2

    .line 62
    invoke-static {p0, p1, p2, p5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastFloatMath;->tryDecToFloatWithFastAlgorithm(ZJI)F

    move-result p0

    .line 63
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_2a

    cmpl-float p0, p0, p3

    if-nez p0, :cond_2a

    return p3

    :cond_2a
    return v1

    :cond_2b
    if-gt v2, p3, :cond_34

    if-gt p3, v0, :cond_34

    .line 74
    invoke-static {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FastFloatMath;->tryDecToFloatWithFastAlgorithm(ZJI)F

    move-result p0

    return p0

    :cond_34
    return v1
.end method

.method static hexFloatLiteralToFloat(ZJIZI)F
    .registers 6

    if-eqz p4, :cond_3

    move p3, p5

    :cond_3
    const/16 p4, -0x7e

    if-gt p4, p3, :cond_1c

    const/16 p4, 0x7f

    if-gt p3, p4, :cond_1c

    long-to-float p1, p1

    .line 89
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    .line 94
    invoke-static {p2, p3}, Ljava/lang/Math;->scalb(FI)F

    move-result p2

    mul-float/2addr p1, p2

    if-eqz p0, :cond_1b

    neg-float p0, p1

    return p0

    :cond_1b
    return p1

    :cond_1c
    const/high16 p0, 0x7fc00000    # Float.NaN

    return p0
.end method

.method static tryDecToFloatWithFastAlgorithm(ZJI)F
    .registers 12

    const/16 v0, -0xa

    if-gt v0, p3, :cond_25

    const/16 v0, 0xa

    if-gt p3, v0, :cond_25

    const-wide/32 v0, 0xffffff

    .line 123
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-gtz v0, :cond_25

    long-to-float p1, p1

    if-gez p3, :cond_1b

    .line 135
    sget-object p2, Lcom/fasterxml/jackson/core/io/doubleparser/FastFloatMath;->FLOAT_POWER_OF_TEN:[F

    neg-int p3, p3

    aget p2, p2, p3

    div-float/2addr p1, p2

    goto :goto_20

    .line 137
    :cond_1b
    sget-object p2, Lcom/fasterxml/jackson/core/io/doubleparser/FastFloatMath;->FLOAT_POWER_OF_TEN:[F

    aget p2, p2, p3

    mul-float/2addr p1, p2

    :goto_20
    if-eqz p0, :cond_24

    neg-float p0, p1

    return p0

    :cond_24
    return p1

    .line 152
    :cond_25
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleMath;->MANTISSA_64:[J

    add-int/lit16 v1, p3, 0x145

    aget-wide v0, v0, v1

    int-to-long v2, p3

    .line 184
    invoke-static {p1, p2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p3

    shl-long/2addr p1, p3

    .line 189
    invoke-static {p1, p2, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->fullMultiplication(JJ)Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;

    move-result-object p1

    .line 190
    iget-wide p1, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;->high:J

    const/16 v0, 0x3f

    ushr-long v0, p1, v0

    const-wide/16 v4, 0x26

    add-long/2addr v4, v0

    long-to-int v4, v4

    ushr-long v4, p1, v4

    const-wide/16 v6, 0x1

    xor-long/2addr v0, v6

    long-to-int v0, v0

    add-int/2addr p3, v0

    const-wide v0, 0x3fffffffffL

    and-long/2addr p1, v0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_9b

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_5d

    const-wide/16 p1, 0x3

    and-long/2addr p1, v4

    cmp-long p1, p1, v6

    if-eqz p1, :cond_9b

    :cond_5d
    add-long/2addr v4, v6

    const/4 p1, 0x1

    ushr-long p1, v4, p1

    const-wide/32 v4, 0x1000000

    cmp-long v4, p1, v4

    if-ltz v4, :cond_6d

    add-int/lit8 p3, p3, -0x1

    const-wide/32 p1, 0x800000

    :cond_6d
    const-wide/32 v4, 0x3526a

    mul-long/2addr v2, v4

    const/16 v4, 0x10

    shr-long/2addr v2, v4

    const-wide/16 v4, 0xbf

    add-long/2addr v2, v4

    int-to-long v4, p3

    sub-long/2addr v2, v4

    cmp-long p3, v2, v6

    if-ltz p3, :cond_9b

    const-wide/16 v4, 0xfe

    cmp-long p3, v2, v4

    if-gtz p3, :cond_9b

    if-eqz p0, :cond_8a

    const-wide v0, 0x80000000L

    :cond_8a
    const-wide/32 v4, -0x800001

    and-long p0, p1, v4

    const/16 p2, 0x17

    shl-long p2, v2, p2

    or-long/2addr p0, p2

    or-long/2addr p0, v0

    long-to-int p0, p0

    .line 252
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    return p0

    :cond_9b
    const/high16 p0, 0x7fc00000    # Float.NaN

    return p0
.end method
