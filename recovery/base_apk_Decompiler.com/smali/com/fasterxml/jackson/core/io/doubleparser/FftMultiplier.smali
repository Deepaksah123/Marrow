###### Class com.fasterxml.jackson.core.io.doubleparser.FftMultiplier (com.fasterxml.jackson.core.io.doubleparser.FftMultiplier)
.class Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;,
        Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;
    }
.end annotation


# static fields
.field public static final COS_0_25:D

.field private static volatile ROOTS2_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

.field private static volatile ROOTS3_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

.field public static final SIN_0_25:D


# direct methods
.method static constructor <clinit>()V
    .registers 4

    const-wide v0, 0x3fe921fb54442d18L    # 0.7853981633974483

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    sput-wide v2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->COS_0_25:D

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    sput-wide v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->SIN_0_25:D

    const/16 v0, 0x14

    .line 57
    new-array v1, v0, [Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    sput-object v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ROOTS2_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    .line 63
    new-array v0, v0, [Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ROOTS3_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    return-void
.end method

.method constructor <init>()V
    .registers 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bitsPerFftPoint(I)I
    .registers 2

    const/16 v0, 0x2600

    if-gt p0, v0, :cond_7

    const/16 p0, 0x13

    return p0

    :cond_7
    const/16 v0, 0x4800

    if-gt p0, v0, :cond_e

    const/16 p0, 0x12

    return p0

    :cond_e
    const v0, 0x11000

    if-gt p0, v0, :cond_16

    const/16 p0, 0x11

    return p0

    :cond_16
    const/high16 v0, 0x40000

    if-gt p0, v0, :cond_1d

    const/16 p0, 0x10

    return p0

    :cond_1d
    const/high16 v0, 0xf0000

    if-gt p0, v0, :cond_24

    const/16 p0, 0xf

    return p0

    :cond_24
    const/high16 v0, 0x380000

    if-gt p0, v0, :cond_2b

    const/16 p0, 0xe

    return p0

    :cond_2b
    const/high16 v0, 0xd00000

    if-gt p0, v0, :cond_32

    const/16 p0, 0xd

    return p0

    :cond_32
    const/high16 v0, 0x1800000

    if-gt p0, v0, :cond_39

    const/16 p0, 0xc

    return p0

    :cond_39
    const/high16 v0, 0x5800000

    if-gt p0, v0, :cond_40

    const/16 p0, 0xb

    return p0

    :cond_40
    const/high16 v0, 0x14000000

    if-gt p0, v0, :cond_47

    const/16 p0, 0xa

    return p0

    :cond_47
    const/high16 v0, 0x48000000    # 131072.0f

    if-gt p0, v0, :cond_4e

    const/16 p0, 0x9

    return p0

    :cond_4e
    const/16 p0, 0x8

    return p0
.end method

.method private static calculateRootsOfUnity(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;
    .registers 16

    const/4 v0, 0x1

    if-ne p0, v0, :cond_14

    .line 117
    new-instance p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;-><init>(I)V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x0

    .line 118
    invoke-virtual {p0, v2, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(ID)V

    const-wide/16 v0, 0x0

    .line 119
    invoke-virtual {p0, v2, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(ID)V

    return-object p0

    .line 122
    :cond_14
    new-instance v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    invoke-direct {v1, p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;-><init>(I)V

    const/4 v4, 0x0

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    const-wide/16 v7, 0x0

    move-object v3, v1

    .line 123
    invoke-virtual/range {v3 .. v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->set(IDD)V

    .line 124
    sget-wide v5, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->COS_0_25:D

    .line 125
    sget-wide v7, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->SIN_0_25:D

    .line 126
    div-int/lit8 v2, p0, 0x2

    move v4, v2

    invoke-virtual/range {v3 .. v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->set(IDD)V

    const-wide v3, 0x3ff921fb54442d18L    # 1.5707963267948966

    int-to-double v5, p0

    div-double v9, v3, v5

    :goto_34
    if-ge v0, v2, :cond_51

    int-to-double v3, v0

    mul-double/2addr v3, v9

    .line 130
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    .line 131
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v13

    move-object v3, v1

    move v4, v0

    move-wide v5, v11

    move-wide v7, v13

    .line 132
    invoke-virtual/range {v3 .. v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->set(IDD)V

    sub-int v4, p0, v0

    move-wide v5, v13

    move-wide v7, v11

    .line 133
    invoke-virtual/range {v3 .. v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->set(IDD)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_34

    :cond_51
    return-object v1
.end method

.method private static fft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V
    .registers 20

    move-object/from16 v0, p0

    .line 150
    invoke-static/range {p0 .. p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v1

    .line 151
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x1f

    .line 152
    new-instance v3, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 153
    new-instance v4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 154
    new-instance v5, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 155
    new-instance v6, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 158
    new-instance v7, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 159
    new-instance v8, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    :goto_2a
    const/4 v10, 0x2

    if-lt v2, v10, :cond_95

    add-int/lit8 v10, v2, -0x2

    .line 162
    aget-object v10, p1, v10

    const/4 v11, 0x1

    shl-int/2addr v11, v2

    const/4 v12, 0x0

    :goto_34
    if-ge v12, v1, :cond_92

    const/4 v13, 0x0

    .line 165
    :goto_37
    div-int/lit8 v14, v11, 0x4

    if-ge v13, v14, :cond_8e

    .line 166
    invoke-virtual {v7, v10, v13}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->set(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 170
    invoke-virtual {v7, v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->squareInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    add-int v15, v12, v13

    add-int/2addr v14, v15

    .line 174
    div-int/lit8 v16, v11, 0x2

    add-int v9, v15, v16

    mul-int/lit8 v16, v11, 0x3

    .line 175
    div-int/lit8 v16, v16, 0x4

    move-object/from16 v17, v10

    add-int v10, v15, v16

    .line 183
    invoke-virtual {v0, v15, v0, v14, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->addInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 184
    invoke-virtual {v3, v0, v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->add(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 185
    invoke-virtual {v3, v0, v10}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->add(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 187
    invoke-virtual {v0, v15, v0, v14, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->subtractTimesIInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 188
    invoke-virtual {v4, v0, v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtract(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 189
    invoke-virtual {v4, v0, v10}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->addTimesI(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 190
    invoke-virtual {v4, v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->multiplyConjugate(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 192
    invoke-virtual {v0, v15, v0, v14, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->subtractInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 193
    invoke-virtual {v5, v0, v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->add(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 194
    invoke-virtual {v5, v0, v10}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtract(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 195
    invoke-virtual {v5, v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->multiplyConjugate(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 197
    invoke-virtual {v0, v15, v0, v14, v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->addTimesIInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 198
    invoke-virtual {v6, v0, v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtract(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 199
    invoke-virtual {v6, v0, v10}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtractTimesI(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 200
    invoke-virtual {v6, v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->multiply(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 202
    invoke-virtual {v3, v0, v15}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->copyInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 203
    invoke-virtual {v4, v0, v14}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->copyInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 204
    invoke-virtual {v5, v0, v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->copyInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 205
    invoke-virtual {v6, v0, v10}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->copyInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v10, v17

    goto :goto_37

    :cond_8e
    move-object/from16 v17, v10

    add-int/2addr v12, v11

    goto :goto_34

    :cond_92
    add-int/lit8 v2, v2, -0x2

    goto :goto_2a

    :cond_95
    if-lez v2, :cond_ab

    const/4 v9, 0x0

    :goto_98
    if-ge v9, v1, :cond_ab

    .line 219
    invoke-virtual {v0, v9, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->copyInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    add-int/lit8 v2, v9, 0x1

    .line 220
    invoke-virtual {v0, v2, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->copyInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 221
    invoke-virtual {v0, v9, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->add(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 222
    invoke-virtual {v3, v4, v0, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtractInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    add-int/lit8 v9, v9, 0x2

    goto :goto_98

    :cond_ab
    return-void
.end method

.method private static fft3(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ID)V
    .registers 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    int-to-double v3, v3

    const-wide/high16 v5, -0x4020000000000000L    # -0.5

    mul-double/2addr v3, v5

    const-wide/high16 v5, 0x4008000000000000L    # 3.0

    .line 238
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    mul-double/2addr v3, v5

    const/4 v5, 0x0

    .line 239
    :goto_14
    invoke-static/range {p0 .. p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v6

    if-ge v5, v6, :cond_ab

    .line 240
    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v6

    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v8

    invoke-virtual {v2, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v10

    .line 241
    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v12

    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v14

    invoke-virtual {v2, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v16

    .line 242
    invoke-virtual {v2, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v18

    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v20

    sub-double v18, v18, v20

    mul-double v18, v18, v3

    .line 243
    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v20

    invoke-virtual {v2, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v22

    sub-double v20, v20, v22

    mul-double v20, v20, v3

    .line 244
    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v22

    invoke-virtual {v2, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v24

    add-double v22, v22, v24

    const-wide/high16 v24, 0x3fe0000000000000L    # 0.5

    mul-double v22, v22, v24

    .line 245
    invoke-virtual {v1, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v26

    invoke-virtual {v2, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v28

    add-double v26, v26, v28

    mul-double v26, v26, v24

    .line 246
    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v24

    .line 247
    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v28

    .line 248
    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v30

    .line 249
    invoke-virtual {v0, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v32

    add-double/2addr v6, v8

    add-double/2addr v6, v10

    mul-double v6, v6, p4

    .line 250
    invoke-virtual {v0, v5, v6, v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(ID)V

    add-double/2addr v12, v14

    add-double v12, v12, v16

    mul-double v12, v12, p4

    .line 251
    invoke-virtual {v0, v5, v12, v13}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(ID)V

    sub-double v24, v24, v22

    add-double v24, v24, v18

    mul-double v6, v24, p4

    .line 252
    invoke-virtual {v1, v5, v6, v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(ID)V

    add-double v28, v28, v20

    sub-double v28, v28, v26

    mul-double v6, v28, p4

    .line 253
    invoke-virtual {v1, v5, v6, v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(ID)V

    sub-double v30, v30, v22

    sub-double v30, v30, v18

    mul-double v6, v30, p4

    .line 254
    invoke-virtual {v2, v5, v6, v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(ID)V

    sub-double v32, v32, v20

    sub-double v32, v32, v26

    mul-double v6, v32, p4

    .line 255
    invoke-virtual {v2, v5, v6, v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(ID)V

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_14

    :cond_ab
    return-void
.end method

.method private static fftMixedRadix(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V
    .registers 14

    .line 276
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    .line 277
    new-instance v7, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    const/4 v8, 0x0

    invoke-direct {v7, p0, v8, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;-><init>(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)V

    shl-int/lit8 v1, v0, 0x1

    .line 278
    new-instance v9, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    invoke-direct {v9, p0, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;-><init>(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)V

    .line 279
    new-instance v10, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v2

    invoke-direct {v10, p0, v1, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;-><init>(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)V

    const/4 v4, 0x1

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    move-object v1, v7

    move-object v2, v9

    move-object v3, v10

    .line 282
    invoke-static/range {v1 .. v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fft3(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ID)V

    .line 285
    new-instance v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 286
    :goto_2a
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v2

    div-int/lit8 v2, v2, 0x4

    if-ge v8, v2, :cond_41

    .line 287
    invoke-virtual {v1, p2, v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->set(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 289
    invoke-virtual {v9, v8, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyConjugate(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 290
    invoke-virtual {v10, v8, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyConjugate(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 291
    invoke-virtual {v10, v8, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyConjugate(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2a

    .line 293
    :cond_41
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v2

    div-int/lit8 v2, v2, 0x4

    :goto_47
    if-ge v2, v0, :cond_60

    .line 294
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v3

    div-int/lit8 v3, v3, 0x4

    sub-int v3, v2, v3

    invoke-virtual {v1, p2, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->set(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 296
    invoke-virtual {v9, v2, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyConjugateTimesI(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 297
    invoke-virtual {v10, v2, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyConjugateTimesI(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 298
    invoke-virtual {v10, v2, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyConjugateTimesI(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_47

    .line 304
    :cond_60
    invoke-static {v7, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 305
    invoke-static {v9, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 306
    invoke-static {v10, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    return-void
.end method

.method static fromFftVector(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)Ljava/math/BigInteger;
    .registers 22

    move/from16 v0, p2

    .line 312
    invoke-static/range {p0 .. p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v1

    int-to-long v1, v1

    int-to-long v3, v0

    const-wide v5, 0x80000000L

    div-long/2addr v5, v3

    const-wide/16 v7, 0x1

    add-long/2addr v5, v7

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    int-to-long v5, v1

    mul-long/2addr v5, v3

    const-wide/16 v2, 0x1f

    add-long/2addr v5, v2

    const/4 v2, 0x3

    shl-long v3, v5, v2

    const-wide/16 v5, 0x20

    .line 313
    div-long/2addr v3, v5

    long-to-int v3, v3

    .line 314
    new-array v4, v3, [B

    shl-int/lit8 v5, v3, 0x3

    sub-int/2addr v5, v0

    shr-int/lit8 v6, v5, 0x3

    const/4 v7, 0x0

    .line 322
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v3, v3, -0x4

    invoke-static {v6, v3}, Ljava/lang/Math;->min(II)I

    move-result v6

    const-wide/16 v8, 0x0

    move v10, v7

    move v11, v10

    :goto_38
    const/4 v12, 0x1

    if-gt v10, v12, :cond_82

    move v13, v7

    :goto_3c
    if-ge v13, v1, :cond_7a

    move-object/from16 v14, p0

    .line 325
    invoke-virtual {v14, v13, v10}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->part(II)D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->round(D)J

    move-result-wide v15

    add-long/2addr v15, v8

    shr-int/lit8 v8, v5, 0x3

    .line 328
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    move-result v8

    sub-int/2addr v6, v8

    shl-int/2addr v6, v2

    ushr-int v6, v11, v6

    move/from16 v17, v3

    int-to-long v2, v6

    shl-int v6, v12, v0

    sub-int/2addr v6, v12

    move/from16 v18, v13

    int-to-long v12, v6

    and-long v11, v15, v12

    rsub-int/lit8 v6, v0, 0x20

    sub-int/2addr v6, v5

    shl-int/lit8 v9, v8, 0x3

    add-int/2addr v6, v9

    shl-long/2addr v11, v6

    or-long/2addr v2, v11

    long-to-int v11, v2

    .line 332
    invoke-static {v4, v8, v11}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->writeIntBE([BII)V

    sub-int/2addr v5, v0

    add-int/lit8 v13, v18, 0x1

    shr-long v2, v15, v0

    move v6, v8

    const/4 v12, 0x1

    move-wide v8, v2

    move/from16 v3, v17

    const/4 v2, 0x3

    goto :goto_3c

    :cond_7a
    move-object/from16 v14, p0

    move/from16 v17, v3

    add-int/lit8 v10, v10, 0x1

    const/4 v2, 0x3

    goto :goto_38

    .line 338
    :cond_82
    new-instance v0, Ljava/math/BigInteger;

    move/from16 v1, p1

    invoke-direct {v0, v1, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    return-object v0
.end method

.method private static getRootsOfUnity2(I)[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;
    .registers 4

    add-int/lit8 v0, p0, 0x1

    .line 348
    new-array v0, v0, [Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    :goto_4
    if-ltz p0, :cond_2c

    const/16 v1, 0x14

    const/4 v2, 0x1

    if-ge p0, v1, :cond_21

    .line 351
    sget-object v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ROOTS2_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    aget-object v1, v1, p0

    if-nez v1, :cond_1a

    .line 352
    sget-object v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ROOTS2_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    shl-int/2addr v2, p0

    invoke-static {v2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->calculateRootsOfUnity(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v2

    aput-object v2, v1, p0

    .line 354
    :cond_1a
    sget-object v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ROOTS2_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    aget-object v1, v1, p0

    aput-object v1, v0, p0

    goto :goto_29

    :cond_21
    shl-int v1, v2, p0

    .line 356
    invoke-static {v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->calculateRootsOfUnity(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v1

    aput-object v1, v0, p0

    :goto_29
    add-int/lit8 p0, p0, -0x2

    goto :goto_4

    :cond_2c
    return-object v0
.end method

.method private static getRootsOfUnity3(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;
    .registers 3

    const/16 v0, 0x14

    const/4 v1, 0x3

    if-ge p0, v0, :cond_19

    .line 370
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ROOTS3_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    aget-object v0, v0, p0

    if-nez v0, :cond_14

    .line 371
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ROOTS3_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    shl-int/2addr v1, p0

    invoke-static {v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->calculateRootsOfUnity(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v1

    aput-object v1, v0, p0

    .line 373
    :cond_14
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ROOTS3_CACHE:[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    aget-object p0, v0, p0

    return-object p0

    :cond_19
    shl-int p0, v1, p0

    .line 375
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->calculateRootsOfUnity(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object p0

    return-object p0
.end method

.method private static ifft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V
    .registers 25

    move-object/from16 v0, p0

    .line 391
    invoke-static/range {p0 .. p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v1

    .line 392
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x1f

    .line 393
    new-instance v3, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 394
    new-instance v4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 395
    new-instance v5, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 396
    new-instance v6, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 397
    new-instance v7, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 398
    new-instance v8, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 399
    new-instance v9, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 400
    new-instance v10, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v10}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 404
    rem-int/lit8 v11, v2, 0x2

    const/4 v13, 0x1

    if-eqz v11, :cond_4f

    const/4 v11, 0x0

    :goto_3a
    if-ge v11, v1, :cond_4d

    add-int/lit8 v14, v11, 0x1

    .line 407
    invoke-virtual {v0, v14, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->copyInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 408
    invoke-virtual {v0, v11, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->copyInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 409
    invoke-virtual {v0, v11, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->add(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 410
    invoke-virtual {v3, v5, v0, v14}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtractInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    add-int/lit8 v11, v11, 0x2

    goto :goto_3a

    :cond_4d
    const/4 v11, 0x2

    goto :goto_50

    :cond_4f
    move v11, v13

    .line 416
    :goto_50
    new-instance v14, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v14}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 417
    new-instance v15, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {v15}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    :goto_5a
    if-gt v11, v2, :cond_e8

    add-int/lit8 v16, v11, -0x1

    .line 419
    aget-object v12, p1, v16

    add-int/lit8 v16, v11, 0x1

    shl-int v16, v13, v16

    const/4 v13, 0x0

    :goto_65
    if-ge v13, v1, :cond_dd

    move/from16 v17, v2

    const/4 v2, 0x0

    :goto_6a
    move/from16 v18, v1

    .line 422
    div-int/lit8 v1, v16, 0x4

    if-ge v2, v1, :cond_d0

    .line 423
    invoke-virtual {v14, v12, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->set(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 427
    invoke-virtual {v14, v15}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->squareInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    move-object/from16 v19, v12

    add-int v12, v13, v2

    add-int/2addr v1, v12

    .line 431
    div-int/lit8 v20, v16, 0x2

    move/from16 v21, v11

    add-int v11, v12, v20

    mul-int/lit8 v20, v16, 0x3

    .line 432
    div-int/lit8 v20, v20, 0x4

    move/from16 v22, v13

    add-int v13, v12, v20

    .line 440
    invoke-virtual {v0, v12, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->copyInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 441
    invoke-virtual {v0, v1, v14, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 442
    invoke-virtual {v0, v11, v15, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 443
    invoke-virtual {v0, v13, v14, v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyConjugateInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 445
    invoke-virtual {v3, v4, v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->addInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 446
    invoke-virtual {v7, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->add(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 447
    invoke-virtual {v7, v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->add(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 449
    invoke-virtual {v3, v4, v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->addTimesIInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 450
    invoke-virtual {v8, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtract(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 451
    invoke-virtual {v8, v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtractTimesI(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 453
    invoke-virtual {v3, v4, v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtractInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 454
    invoke-virtual {v9, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->add(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 455
    invoke-virtual {v9, v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtract(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 457
    invoke-virtual {v3, v4, v10}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtractTimesIInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 458
    invoke-virtual {v10, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->subtract(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 459
    invoke-virtual {v10, v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->addTimesI(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 461
    invoke-virtual {v7, v0, v12}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->copyInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 462
    invoke-virtual {v8, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->copyInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 463
    invoke-virtual {v9, v0, v11}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->copyInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 464
    invoke-virtual {v10, v0, v13}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->copyInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    add-int/lit8 v2, v2, 0x1

    move/from16 v1, v18

    move-object/from16 v12, v19

    move/from16 v11, v21

    move/from16 v13, v22

    goto :goto_6a

    :cond_d0
    move/from16 v21, v11

    move-object/from16 v19, v12

    move/from16 v22, v13

    add-int v13, v22, v16

    move/from16 v2, v17

    move/from16 v1, v18

    goto :goto_65

    :cond_dd
    move/from16 v18, v1

    move/from16 v17, v2

    move/from16 v21, v11

    add-int/lit8 v11, v21, 0x2

    const/4 v13, 0x1

    goto/16 :goto_5a

    :cond_e8
    move/from16 v17, v2

    const/4 v12, 0x0

    :goto_eb
    if-ge v12, v1, :cond_f6

    move/from16 v2, v17

    neg-int v3, v2

    .line 471
    invoke-virtual {v0, v12, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->timesTwoToThe(II)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_eb

    :cond_f6
    return-void
.end method

.method private static ifftMixedRadix(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V
    .registers 10

    .line 492
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    .line 493
    new-instance v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;-><init>(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)V

    shl-int/lit8 v3, v0, 0x1

    .line 494
    new-instance v4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    invoke-direct {v4, p0, v0, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;-><init>(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)V

    .line 495
    new-instance v5, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v6

    invoke-direct {v5, p0, v3, v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;-><init>(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)V

    .line 498
    invoke-static {v1, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ifft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 499
    invoke-static {v4, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ifft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 500
    invoke-static {v5, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ifft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 503
    new-instance p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;

    invoke-direct {p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;-><init>()V

    .line 504
    :goto_2a
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v3

    div-int/lit8 v3, v3, 0x4

    if-ge v2, v3, :cond_41

    .line 505
    invoke-virtual {p1, p2, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->set(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 507
    invoke-virtual {v4, v2, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiply(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 508
    invoke-virtual {v5, v2, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiply(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 509
    invoke-virtual {v5, v2, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiply(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2a

    .line 511
    :cond_41
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v2

    div-int/lit8 v2, v2, 0x4

    :goto_47
    if-ge v2, v0, :cond_60

    .line 512
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I

    move-result v3

    div-int/lit8 v3, v3, 0x4

    sub-int v3, v2, v3

    invoke-virtual {p1, p2, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->set(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V

    .line 514
    invoke-virtual {v4, v2, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyByIAnd(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 515
    invoke-virtual {v5, v2, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyByIAnd(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    .line 516
    invoke-virtual {v5, v2, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyByIAnd(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_47

    :cond_60
    const/4 p0, -0x1

    const-wide p1, 0x3fd5555555555555L    # 0.3333333333333333

    move-object v2, v4

    move-object v3, v5

    move v4, p0

    move-wide v5, p1

    .line 522
    invoke-static/range {v1 .. v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fft3(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ID)V

    return-void
.end method

.method static multiply(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 8

    .line 535
    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-eqz v0, :cond_46

    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-eqz v0, :cond_46

    if-ne p1, p0, :cond_13

    .line 539
    invoke-static {p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->square(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 542
    :cond_13
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    .line 543
    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    int-to-long v2, v0

    int-to-long v4, v1

    add-long/2addr v2, v4

    const-wide v4, 0x80000000L

    cmp-long v2, v2, v4

    if-gtz v2, :cond_3e

    const/16 v2, 0x780

    if-le v0, v2, :cond_39

    if-le v1, v2, :cond_39

    const v2, 0x81c4

    if-gt v0, v2, :cond_34

    if-le v1, v2, :cond_39

    .line 551
    :cond_34
    invoke-static {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->multiplyFft(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 553
    :cond_39
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 545
    :cond_3e
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string p1, "BigInteger would overflow supported range"

    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 536
    :cond_46
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    return-object p0
.end method

.method static multiplyFft(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 11

    .line 599
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    move-result v0

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v1

    mul-int/2addr v0, v1

    .line 600
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    move-result v1

    if-gez v1, :cond_13

    invoke-virtual {p0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object p0

    :cond_13
    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    .line 601
    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v1

    if-gez v1, :cond_21

    invoke-virtual {p1}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object p1

    :cond_21
    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    .line 602
    array-length v1, p0

    array-length v2, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/4 v2, 0x3

    shl-int/2addr v1, v2

    .line 603
    invoke-static {v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->bitsPerFftPoint(I)I

    move-result v3

    add-int/2addr v1, v3

    const/4 v4, 0x1

    sub-int/2addr v1, v4

    .line 604
    div-int/2addr v1, v3

    .line 605
    invoke-static {v1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v5

    rsub-int/lit8 v6, v5, 0x20

    shl-int v7, v4, v6

    mul-int/lit8 v8, v7, 0x3

    .line 609
    div-int/lit8 v8, v8, 0x4

    add-int/2addr v1, v4

    if-ge v1, v8, :cond_78

    if-le v6, v2, :cond_78

    rsub-int/lit8 v1, v5, 0x1e

    .line 611
    invoke-static {v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->getRootsOfUnity2(I)[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v2

    .line 612
    invoke-static {v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->getRootsOfUnity3(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v1

    rsub-int/lit8 v4, v5, 0x1c

    .line 613
    invoke-static {v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->getRootsOfUnity3(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v4

    .line 614
    invoke-static {p0, v8, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->toFftVector([BII)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object p0

    .line 615
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 616
    invoke-static {p0, v2, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fftMixedRadix(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 617
    invoke-static {p1, v8, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->toFftVector([BII)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object p1

    .line 618
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 619
    invoke-static {p1, v2, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fftMixedRadix(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 620
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyPointwise(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 621
    invoke-static {p0, v2, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ifftMixedRadix(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 622
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyInverseWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 623
    invoke-static {p0, v0, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fromFftVector(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 625
    :cond_78
    invoke-static {v6}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->getRootsOfUnity2(I)[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v1

    .line 626
    invoke-static {p0, v7, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->toFftVector([BII)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object p0

    .line 627
    aget-object v2, v1, v6

    invoke-virtual {p0, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 628
    invoke-static {p0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 629
    invoke-static {p1, v7, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->toFftVector([BII)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object p1

    .line 630
    aget-object v2, v1, v6

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 631
    invoke-static {p1, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 632
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->multiplyPointwise(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 633
    invoke-static {p0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ifft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 634
    aget-object p1, v1, v6

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyInverseWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 635
    invoke-static {p0, v0, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fromFftVector(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method static square(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 3

    .line 645
    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    move-result v0

    if-nez v0, :cond_9

    .line 646
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    return-object p0

    .line 648
    :cond_9
    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const v1, 0x81c4

    if-ge v0, v1, :cond_17

    invoke-virtual {p0, p0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_17
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->squareFft(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method static squareFft(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .registers 8

    .line 652
    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    .line 653
    array-length v0, p0

    shl-int/lit8 v0, v0, 0x3

    .line 654
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->bitsPerFftPoint(I)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    .line 655
    div-int/2addr v0, v1

    .line 656
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v3

    rsub-int/lit8 v4, v3, 0x20

    shl-int v5, v2, v4

    mul-int/lit8 v6, v5, 0x3

    .line 660
    div-int/lit8 v6, v6, 0x4

    add-int/2addr v0, v2

    if-ge v0, v6, :cond_46

    .line 663
    invoke-static {p0, v6, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->toFftVector([BII)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object p0

    rsub-int/lit8 v0, v3, 0x1e

    .line 664
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->getRootsOfUnity2(I)[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v4

    .line 665
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->getRootsOfUnity3(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v0

    rsub-int/lit8 v3, v3, 0x1c

    .line 666
    invoke-static {v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->getRootsOfUnity3(I)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v3

    .line 667
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 668
    invoke-static {p0, v4, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fftMixedRadix(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 669
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->squarePointwise()V

    .line 670
    invoke-static {p0, v4, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ifftMixedRadix(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 671
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyInverseWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 672
    invoke-static {p0, v2, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fromFftVector(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 675
    :cond_46
    invoke-static {p0, v5, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->toFftVector([BII)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object p0

    .line 676
    invoke-static {v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->getRootsOfUnity2(I)[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    move-result-object v0

    .line 677
    aget-object v3, v0, v4

    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 678
    invoke-static {p0, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 679
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->squarePointwise()V

    .line 680
    invoke-static {p0, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->ifft(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;[Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 681
    aget-object v0, v0, v4

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->applyInverseWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V

    .line 682
    invoke-static {p0, v2, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->fromFftVector(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method static toFftVector([BII)Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;
    .registers 13

    .line 693
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;

    invoke-direct {v0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;-><init>(I)V

    .line 694
    array-length p1, p0

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-ge p1, v2, :cond_14

    .line 695
    new-array p1, v2, [B

    .line 696
    array-length v3, p0

    rsub-int/lit8 v3, v3, 0x4

    array-length v4, p0

    invoke-static {p0, v1, p1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p0, p1

    :cond_14
    const/4 p1, 0x1

    shl-int/2addr p1, p2

    .line 702
    div-int/lit8 v3, p1, 0x2

    .line 705
    array-length v4, p0

    shl-int/lit8 v4, v4, 0x3

    sub-int/2addr v4, p2

    move v5, v1

    move v6, v5

    :goto_1e
    neg-int v7, p2

    if-le v4, v7, :cond_4c

    shr-int/lit8 v7, v4, 0x3

    .line 709
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    array-length v8, p0

    sub-int/2addr v8, v2

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 711
    invoke-static {p0, v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->readIntBE([BI)I

    move-result v8

    rsub-int/lit8 v9, p2, 0x20

    sub-int/2addr v9, v4

    shl-int/lit8 v7, v7, 0x3

    add-int/2addr v9, v7

    ushr-int v7, v8, v9

    add-int/lit8 v8, p1, -0x1

    and-int/2addr v7, v8

    add-int/2addr v7, v5

    sub-int v5, v3, v7

    ushr-int/lit8 v5, v5, 0x1f

    neg-int v8, v5

    and-int/2addr v8, p1

    sub-int/2addr v7, v8

    int-to-double v7, v7

    .line 718
    invoke-virtual {v0, v6, v7, v8}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(ID)V

    add-int/lit8 v6, v6, 0x1

    sub-int/2addr v4, p2

    goto :goto_1e

    :cond_4c
    if-lez v5, :cond_52

    int-to-double p0, v5

    .line 723
    invoke-virtual {v0, v6, p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(ID)V

    :cond_52
    return-object v0
.end method

###### Class com.fasterxml.jackson.core.io.doubleparser.FftMultiplier.ComplexVector (com.fasterxml.jackson.core.io.doubleparser.FftMultiplier$ComplexVector)
.class final Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "ComplexVector"
.end annotation


# instance fields
.field private final a:[D

.field private final length:I

.field private final offset:I


# direct methods
.method constructor <init>(I)V
    .registers 3

    .line 753
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    shl-int/lit8 v0, p1, 0x1

    .line 754
    new-array v0, v0, [D

    iput-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    .line 755
    iput p1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->length:I

    const/4 p1, 0x0

    .line 756
    iput p1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    return-void
.end method

.method constructor <init>(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;II)V
    .registers 4

    .line 766
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sub-int/2addr p3, p2

    .line 767
    iput p3, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->length:I

    .line 768
    iget-object p1, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    iput-object p1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    shl-int/lit8 p1, p2, 0x1

    .line 769
    iput p1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    return-void
.end method

.method static synthetic access$000(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)I
    .registers 1

    .line 730
    iget p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->length:I

    return p0
.end method

.method private imagIdx(I)I
    .registers 2

    shl-int/lit8 p1, p1, 0x1

    .line 840
    iget p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    add-int/2addr p1, p0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private realIdx(I)I
    .registers 2

    shl-int/lit8 p1, p1, 0x1

    .line 941
    iget p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    add-int/2addr p1, p0

    return p1
.end method


# virtual methods
.method final add(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 9

    .line 773
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v1

    aget-wide v2, v0, v1

    iget-wide v4, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    add-double/2addr v2, v4

    aput-wide v2, v0, v1

    .line 774
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p0

    aget-wide v1, v0, p0

    iget-wide p1, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    add-double/2addr v1, p1

    aput-wide v1, v0, p0

    return-void
.end method

.method final addInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 9

    .line 778
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v1

    aget-wide v0, v0, v1

    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v2

    add-double/2addr v0, v2

    iput-wide v0, p4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 779
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p0

    aget-wide p0, v0, p0

    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide p2

    add-double/2addr p0, p2

    iput-wide p0, p4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final addTimesIInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 9

    .line 783
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v1

    aget-wide v0, v0, v1

    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v2

    sub-double/2addr v0, v2

    iput-wide v0, p4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 784
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p0

    aget-wide p0, v0, p0

    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide p2

    add-double/2addr p0, p2

    iput-wide p0, p4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final applyInverseWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 792
    iget v2, v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    .line 793
    iget v3, v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    .line 794
    iget-object v1, v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    const/4 v4, 0x0

    .line 795
    :goto_b
    iget v5, v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->length:I

    if-ge v4, v5, :cond_3b

    .line 798
    iget-object v5, v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aget-wide v12, v5, v2

    add-int/lit8 v14, v2, 0x1

    .line 799
    aget-wide v15, v5, v14

    .line 800
    aget-wide v8, v1, v3

    add-int/lit8 v17, v3, 0x1

    aget-wide v6, v1, v17

    mul-double v10, v6, v15

    move-wide v6, v12

    invoke-static/range {v6 .. v11}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v6

    aput-wide v6, v5, v2

    .line 801
    iget-object v5, v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    neg-double v6, v12

    aget-wide v8, v1, v17

    aget-wide v10, v1, v3

    mul-double/2addr v10, v15

    invoke-static/range {v6 .. v11}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v6

    aput-wide v6, v5, v14

    add-int/lit8 v2, v2, 0x2

    add-int/lit8 v3, v3, 0x2

    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_3b
    return-void
.end method

.method final applyWeights(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V
    .registers 12

    .line 815
    iget v0, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    .line 816
    iget-object p1, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    .line 817
    iget v1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    iget v2, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->length:I

    move v3, v1

    :goto_9
    add-int v4, v2, v1

    shl-int/lit8 v4, v4, 0x1

    if-ge v3, v4, :cond_26

    .line 819
    iget-object v4, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aget-wide v5, v4, v3

    .line 820
    aget-wide v7, p1, v0

    mul-double/2addr v7, v5

    aput-wide v7, v4, v3

    add-int/lit8 v7, v3, 0x1

    add-int/lit8 v8, v0, 0x1

    .line 821
    aget-wide v8, p1, v8

    mul-double/2addr v5, v8

    aput-wide v5, v4, v7

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v3, v3, 0x2

    goto :goto_9

    :cond_26
    return-void
.end method

.method final copyInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 5

    .line 827
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v1

    aget-wide v0, v0, v1

    iput-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 828
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p0

    aget-wide p0, v0, p0

    iput-wide p0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final imag(I)D
    .registers 3

    .line 832
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    shl-int/lit8 p1, p1, 0x1

    iget p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    add-int/2addr p1, p0

    add-int/lit8 p1, p1, 0x1

    aget-wide p0, v0, p1

    return-wide p0
.end method

.method final imag(ID)V
    .registers 5

    .line 836
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    shl-int/lit8 p1, p1, 0x1

    iget p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    add-int/2addr p1, p0

    add-int/lit8 p1, p1, 0x1

    aput-wide p2, v0, p1

    return-void
.end method

.method final multiply(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 15

    .line 848
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v0

    .line 849
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p1

    .line 850
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aget-wide v8, v1, v0

    .line 851
    aget-wide v10, v1, p1

    .line 852
    iget-wide v4, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    neg-double v2, v10

    iget-wide v6, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    mul-double/2addr v6, v2

    move-wide v2, v8

    invoke-static/range {v2 .. v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v2

    aput-wide v2, v1, v0

    .line 853
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    iget-wide v4, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    mul-double v6, v10, v0

    move-wide v2, v8

    invoke-static/range {v2 .. v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v0

    aput-wide v0, p0, p1

    return-void
.end method

.method final multiplyByIAnd(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 15

    .line 861
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v0

    .line 862
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p1

    .line 863
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aget-wide v2, v1, v0

    .line 864
    aget-wide v4, v1, p1

    neg-double v6, v2

    .line 865
    iget-wide v8, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    neg-double v4, v4

    iget-wide v10, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    mul-double/2addr v10, v4

    invoke-static/range {v6 .. v11}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v6

    aput-wide v6, v1, v0

    .line 866
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    iget-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v6, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    mul-double/2addr v6, v4

    move-wide v4, v0

    invoke-static/range {v2 .. v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v0

    aput-wide v0, p0, p1

    return-void
.end method

.method final multiplyConjugate(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 15

    .line 874
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v0

    .line 875
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p1

    .line 876
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aget-wide v8, v1, v0

    .line 877
    aget-wide v10, v1, p1

    .line 878
    iget-wide v4, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    mul-double v6, v2, v10

    move-wide v2, v8

    invoke-static/range {v2 .. v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v2

    aput-wide v2, v1, v0

    .line 879
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    neg-double v0, v8

    iget-wide v2, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v4, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    mul-double/2addr v4, v10

    invoke-static/range {v0 .. v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v0

    aput-wide v0, p0, p1

    return-void
.end method

.method final multiplyConjugateInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 14

    .line 883
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v1

    aget-wide v0, v0, v1

    .line 884
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p0

    aget-wide p0, v2, p0

    .line 885
    iget-wide v4, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    mul-double v6, p0, v2

    move-wide v2, v0

    invoke-static/range {v2 .. v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v2

    iput-wide v2, p3, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    neg-double v4, v0

    .line 886
    iget-wide v6, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    mul-double v8, p0, v0

    invoke-static/range {v4 .. v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide p0

    iput-wide p0, p3, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final multiplyConjugateTimesI(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 15

    .line 895
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v0

    .line 896
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p1

    .line 897
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aget-wide v2, v1, v0

    .line 898
    aget-wide v4, v1, p1

    neg-double v2, v2

    .line 899
    iget-wide v8, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v6, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    mul-double v10, v4, v6

    move-wide v6, v2

    invoke-static/range {v6 .. v11}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v6

    aput-wide v6, v1, v0

    .line 900
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    iget-wide v8, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    neg-double v0, v4

    iget-wide v4, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    mul-double v10, v0, v4

    move-wide v6, v2

    invoke-static/range {v6 .. v11}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v0

    aput-wide v0, p0, p1

    return-void
.end method

.method final multiplyInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 12

    .line 904
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v1

    aget-wide v0, v0, v1

    .line 905
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p0

    aget-wide p0, v2, p0

    .line 906
    iget-wide v4, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    neg-double v2, p0

    iget-wide v6, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    mul-double/2addr v6, v2

    move-wide v2, v0

    invoke-static/range {v2 .. v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v2

    iput-wide v2, p3, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 907
    iget-wide v4, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v2, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    mul-double v6, p0, v2

    move-wide v2, v0

    invoke-static/range {v2 .. v7}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide p0

    iput-wide p0, p3, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final multiplyPointwise(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;)V
    .registers 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 913
    iget v2, v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    .line 914
    iget-object v1, v1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    .line 915
    iget v3, v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    iget v4, v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->length:I

    move v5, v3

    :goto_d
    add-int v6, v4, v3

    shl-int/lit8 v6, v6, 0x1

    if-ge v5, v6, :cond_43

    .line 918
    iget-object v6, v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aget-wide v13, v6, v5

    add-int/lit8 v15, v5, 0x1

    .line 919
    aget-wide v11, v6, v15

    .line 920
    aget-wide v16, v1, v2

    add-int/lit8 v7, v2, 0x1

    .line 921
    aget-wide v18, v1, v7

    neg-double v7, v11

    mul-double v20, v7, v18

    move-wide v7, v13

    move-wide/from16 v9, v16

    move-wide/from16 v22, v11

    move-wide/from16 v11, v20

    .line 922
    invoke-static/range {v7 .. v12}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v7

    aput-wide v7, v6, v5

    .line 923
    iget-object v6, v0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    mul-double v11, v22, v16

    move-wide v7, v13

    move-wide/from16 v9, v18

    invoke-static/range {v7 .. v12}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v7

    aput-wide v7, v6, v15

    add-int/lit8 v2, v2, 0x2

    add-int/lit8 v5, v5, 0x2

    goto :goto_d

    :cond_43
    return-void
.end method

.method final part(II)D
    .registers 3

    .line 929
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-wide p0, p0, p1

    return-wide p0
.end method

.method final real(I)D
    .registers 3

    .line 933
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    shl-int/lit8 p1, p1, 0x1

    iget p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    add-int/2addr p1, p0

    aget-wide p0, v0, p1

    return-wide p0
.end method

.method final real(ID)V
    .registers 5

    .line 937
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    shl-int/lit8 p1, p1, 0x1

    iget p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    add-int/2addr p1, p0

    aput-wide p2, v0, p1

    return-void
.end method

.method final set(IDD)V
    .registers 6

    .line 945
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result p1

    .line 946
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aput-wide p2, p0, p1

    add-int/lit8 p1, p1, 0x1

    .line 947
    aput-wide p4, p0, p1

    return-void
.end method

.method final squarePointwise()V
    .registers 16

    .line 956
    iget v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->offset:I

    iget v1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->length:I

    move v2, v0

    :goto_5
    add-int v3, v1, v0

    shl-int/lit8 v3, v3, 0x1

    if-ge v2, v3, :cond_29

    .line 958
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aget-wide v10, v3, v2

    add-int/lit8 v12, v2, 0x1

    .line 959
    aget-wide v13, v3, v12

    neg-double v4, v13

    mul-double v8, v4, v13

    move-wide v4, v10

    move-wide v6, v10

    .line 960
    invoke-static/range {v4 .. v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v4

    aput-wide v4, v3, v2

    .line 961
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v10, v4

    mul-double/2addr v10, v13

    aput-wide v10, v3, v12

    add-int/lit8 v2, v2, 0x2

    goto :goto_5

    :cond_29
    return-void
.end method

.method final subtractInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 9

    .line 966
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v1

    aget-wide v0, v0, v1

    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v2

    sub-double/2addr v0, v2

    iput-wide v0, p4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 967
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p0

    aget-wide p0, v0, p0

    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide p2

    sub-double/2addr p0, p2

    iput-wide p0, p4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final subtractTimesIInto(ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;ILcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 9

    .line 971
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v1

    aget-wide v0, v0, v1

    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v2

    add-double/2addr v0, v2

    iput-wide v0, p4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 972
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p0

    aget-wide p0, v0, p0

    invoke-virtual {p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide p2

    sub-double/2addr p0, p2

    iput-wide p0, p4, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final timesTwoToThe(II)V
    .registers 9

    .line 976
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->realIdx(I)I

    move-result v0

    .line 977
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imagIdx(I)I

    move-result p1

    .line 978
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    aget-wide v2, v1, v0

    .line 979
    aget-wide v4, v1, p1

    .line 980
    invoke-static {v2, v3, p2}, Ljava/lang/Math;->scalb(DI)D

    move-result-wide v2

    aput-wide v2, v1, v0

    .line 981
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->a:[D

    invoke-static {v4, v5, p2}, Ljava/lang/Math;->scalb(DI)D

    move-result-wide v0

    aput-wide v0, p0, p1

    return-void
.end method

###### Class com.fasterxml.jackson.core.io.doubleparser.FftMultiplier.MutableComplex (com.fasterxml.jackson.core.io.doubleparser.FftMultiplier$MutableComplex)
.class final Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "MutableComplex"
.end annotation


# instance fields
.field imag:D

.field real:D


# direct methods
.method constructor <init>()V
    .registers 1

    .line 988
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method final add(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V
    .registers 7

    .line 997
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v2

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 998
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide p1

    add-double/2addr v0, p1

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final add(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 6

    .line 992
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 993
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final addInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 7

    .line 1006
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    add-double/2addr v0, v2

    iput-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1007
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide p0, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    add-double/2addr v0, p0

    iput-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final addTimesI(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V
    .registers 7

    .line 1019
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v2

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1020
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide p1

    add-double/2addr v0, p1

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final addTimesI(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 6

    .line 1014
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1015
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final addTimesIInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 7

    .line 1028
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    sub-double/2addr v0, v2

    iput-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1029
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide p0, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    add-double/2addr v0, p0

    iput-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final copyInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V
    .registers 5

    .line 1033
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    invoke-virtual {p1, p2, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(ID)V

    .line 1034
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    invoke-virtual {p1, p2, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(ID)V

    return-void
.end method

.method final multiply(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 10

    .line 1038
    iget-wide v6, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1039
    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    neg-double v0, v0

    iget-wide v4, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    mul-double/2addr v4, v0

    move-wide v0, v6

    invoke-static/range {v0 .. v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1040
    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v4, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    mul-double/2addr v4, v0

    move-wide v0, v6

    invoke-static/range {v0 .. v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final multiplyConjugate(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 16

    .line 1047
    iget-wide v6, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1048
    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v4, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    mul-double/2addr v4, v0

    move-wide v0, v6

    invoke-static/range {v0 .. v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    neg-double v8, v6

    .line 1049
    iget-wide v10, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    mul-double v12, v0, v2

    invoke-static/range {v8 .. v13}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final set(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V
    .registers 5

    .line 1053
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1054
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final squareInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 8

    .line 1058
    iget-wide v2, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    neg-double v4, v0

    mul-double/2addr v4, v0

    move-wide v0, v2

    invoke-static/range {v0 .. v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->fma(DDD)D

    move-result-wide v0

    iput-wide v0, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1059
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    mul-double/2addr v0, v2

    iget-wide v2, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    mul-double/2addr v0, v2

    iput-wide v0, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final subtract(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V
    .registers 7

    .line 1068
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide v2

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1069
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide p1

    sub-double/2addr v0, p1

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final subtract(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 6

    .line 1063
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1064
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final subtractInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V
    .registers 8

    .line 1078
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    sub-double/2addr v0, v2

    invoke-virtual {p2, p3, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(ID)V

    .line 1079
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide p0, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    sub-double/2addr v0, p0

    invoke-virtual {p2, p3, v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(ID)V

    return-void
.end method

.method final subtractInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 7

    .line 1073
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    sub-double/2addr v0, v2

    iput-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1074
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide p0, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    sub-double/2addr v0, p0

    iput-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final subtractTimesI(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;I)V
    .registers 7

    .line 1088
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->imag(I)D

    move-result-wide v2

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1089
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$ComplexVector;->real(I)D

    move-result-wide p1

    sub-double/2addr v0, p1

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final subtractTimesI(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 6

    .line 1083
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1084
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method

.method final subtractTimesIInto(Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;)V
    .registers 7

    .line 1093
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    iget-wide v2, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    add-double/2addr v0, v2

    iput-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    .line 1094
    iget-wide v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    iget-wide p0, p1, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->real:D

    sub-double/2addr v0, p0

    iput-wide v0, p2, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier$MutableComplex;->imag:D

    return-void
.end method
