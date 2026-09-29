###### Class com.fasterxml.jackson.core.io.doubleparser.AbstractJavaFloatingPointBitsFromCharSequence (com.fasterxml.jackson.core.io.doubleparser.AbstractJavaFloatingPointBitsFromCharSequence)
.class abstract Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;
.super Lcom/fasterxml/jackson/core/io/doubleparser/AbstractFloatValueParser;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .registers 1

    .line 17
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractFloatValueParser;-><init>()V

    return-void
.end method

.method private parseDecFloatLiteral(Ljava/lang/CharSequence;IIIZZ)J
    .registers 28

    move-object/from16 v1, p1

    move/from16 v3, p4

    const/4 v0, -0x1

    move/from16 v6, p2

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_b
    const-wide/16 v11, 0x30

    const-wide/16 v13, 0xa

    const/16 v15, 0x2e

    const/16 v16, 0x1

    if-ge v6, v3, :cond_31

    .line 79
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    .line 80
    invoke-static {v9}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v17

    if-eqz v17, :cond_24

    mul-long/2addr v7, v13

    int-to-long v13, v9

    add-long/2addr v7, v13

    sub-long/2addr v7, v11

    goto :goto_2e

    :cond_24
    if-ne v9, v15, :cond_31

    if-ltz v0, :cond_29

    goto :goto_2b

    :cond_29
    const/16 v16, 0x0

    :goto_2b
    or-int v10, v10, v16

    move v0, v6

    :goto_2e
    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :cond_31
    if-gez v0, :cond_3a

    sub-int v0, v6, p2

    move/from16 v17, v6

    const/16 v18, 0x0

    goto :goto_4a

    :cond_3a
    sub-int v17, v0, v6

    add-int/lit8 v17, v17, 0x1

    sub-int v18, v6, p2

    add-int/lit8 v18, v18, -0x1

    move/from16 v20, v17

    move/from16 v17, v0

    move/from16 v0, v18

    move/from16 v18, v20

    :goto_4a
    or-int/lit8 v2, v9, 0x20

    const/16 v4, 0x65

    if-ne v2, v4, :cond_92

    add-int/lit8 v2, v6, 0x1

    .line 115
    invoke-static {v1, v2, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v4

    const/16 v5, 0x2d

    if-ne v4, v5, :cond_5d

    move/from16 v5, v16

    goto :goto_5e

    :cond_5d
    const/4 v5, 0x0

    :goto_5e
    if-nez v5, :cond_64

    const/16 v9, 0x2b

    if-ne v4, v9, :cond_6a

    :cond_64
    add-int/lit8 v2, v6, 0x2

    .line 118
    invoke-static {v1, v2, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v4

    .line 120
    :cond_6a
    invoke-static {v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v19

    const/4 v9, 0x0

    :cond_6f
    const/16 v11, 0x400

    if-ge v9, v11, :cond_78

    mul-int/lit8 v9, v9, 0xa

    add-int/2addr v9, v4

    add-int/lit8 v9, v9, -0x30

    :cond_78
    add-int/lit8 v2, v2, 0x1

    .line 126
    invoke-static {v1, v2, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v4

    .line 127
    invoke-static {v4}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v11

    if-nez v11, :cond_6f

    if-eqz v5, :cond_87

    neg-int v9, v9

    :cond_87
    add-int v18, v18, v9

    xor-int/lit8 v5, v19, 0x1

    or-int/2addr v10, v5

    move/from16 v20, v9

    move v9, v4

    move/from16 v4, v20

    goto :goto_94

    :cond_92
    move v2, v6

    const/4 v4, 0x0

    :goto_94
    const/16 v5, 0x64

    if-ne v9, v5, :cond_9b

    move/from16 v5, v16

    goto :goto_9c

    :cond_9b
    const/4 v5, 0x0

    :goto_9c
    const/16 v11, 0x44

    if-ne v9, v11, :cond_a3

    move/from16 v11, v16

    goto :goto_a4

    :cond_a3
    const/4 v11, 0x0

    :goto_a4
    const/16 v12, 0x66

    if-ne v9, v12, :cond_ab

    move/from16 v12, v16

    goto :goto_ac

    :cond_ab
    const/4 v12, 0x0

    :goto_ac
    const/16 v13, 0x46

    if-ne v9, v13, :cond_b3

    move/from16 v9, v16

    goto :goto_b4

    :cond_b3
    const/4 v9, 0x0

    :goto_b4
    or-int/2addr v5, v11

    or-int/2addr v5, v12

    or-int/2addr v5, v9

    if-eqz v5, :cond_bb

    add-int/lit8 v2, v2, 0x1

    .line 143
    :cond_bb
    invoke-static {v1, v2, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->skipWhitespace(Ljava/lang/CharSequence;II)I

    move-result v2

    if-nez v10, :cond_11a

    if-lt v2, v3, :cond_11a

    if-nez p6, :cond_c7

    if-eqz v0, :cond_11a

    :cond_c7
    const/16 v2, 0x13

    if-le v0, v2, :cond_106

    move/from16 v0, p2

    const/4 v2, 0x0

    const-wide/16 v7, 0x0

    :goto_d0
    if-ge v0, v6, :cond_f5

    .line 157
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-ne v5, v15, :cond_df

    add-int/lit8 v2, v2, 0x1

    const-wide/16 v9, 0xa

    const-wide/16 v11, 0x30

    goto :goto_f2

    :cond_df
    const-wide v9, 0xde0b6b3a7640000L

    .line 161
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v9

    if-gez v9, :cond_f5

    const-wide/16 v9, 0xa

    mul-long/2addr v7, v9

    int-to-long v11, v5

    add-long/2addr v7, v11

    const-wide/16 v11, 0x30

    sub-long/2addr v7, v11

    :goto_f2
    add-int/lit8 v0, v0, 0x1

    goto :goto_d0

    :cond_f5
    if-ge v0, v6, :cond_f8

    goto :goto_fa

    :cond_f8
    const/16 v16, 0x0

    :goto_fa
    sub-int v17, v17, v0

    add-int v17, v17, v2

    add-int v17, v17, v4

    move-wide v5, v7

    move/from16 v8, v16

    move/from16 v9, v17

    goto :goto_109

    :cond_106
    move-wide v5, v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_109
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    move/from16 v7, v18

    .line 174
    invoke-virtual/range {v0 .. v9}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->valueOfFloatLiteral(Ljava/lang/CharSequence;IIZJIZI)J

    move-result-wide v0

    return-wide v0

    .line 146
    :cond_11a
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "illegal syntax"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private parseHexFloatLiteral(Ljava/lang/CharSequence;IIIZ)J
    .registers 28

    move-object/from16 v1, p1

    move/from16 v3, p4

    const/4 v0, -0x1

    const-wide/16 v4, 0x0

    move/from16 v6, p2

    move-wide v7, v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_c
    const/4 v11, 0x4

    const/4 v12, 0x1

    if-ge v6, v3, :cond_44

    .line 275
    invoke-interface {v1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    .line 277
    invoke-static {v9}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->lookupHex(C)I

    move-result v13

    if-ltz v13, :cond_1e

    shl-long/2addr v7, v11

    int-to-long v13, v13

    or-long/2addr v7, v13

    goto :goto_42

    :cond_1e
    const/4 v14, -0x4

    if-ne v13, v14, :cond_44

    if-ltz v0, :cond_25

    move v0, v12

    goto :goto_26

    :cond_25
    const/4 v0, 0x0

    :goto_26
    or-int/2addr v10, v0

    move v0, v6

    :goto_28
    add-int/lit8 v11, v3, -0x8

    if-ge v0, v11, :cond_3d

    add-int/lit8 v11, v0, 0x1

    .line 284
    invoke-static {v1, v11}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->tryToParseEightHexDigits(Ljava/lang/CharSequence;I)J

    move-result-wide v13

    cmp-long v11, v13, v4

    if-ltz v11, :cond_3d

    const/16 v11, 0x20

    shl-long/2addr v7, v11

    add-long/2addr v7, v13

    add-int/lit8 v0, v0, 0x8

    goto :goto_28

    :cond_3d
    move/from16 v21, v6

    move v6, v0

    move/from16 v0, v21

    :goto_42
    add-int/2addr v6, v12

    goto :goto_c

    :cond_44
    const/16 v13, 0x400

    if-gez v0, :cond_4d

    sub-int v0, v6, p2

    move v14, v6

    const/4 v15, 0x0

    goto :goto_5f

    :cond_4d
    sub-int v14, v0, v6

    add-int/2addr v14, v12

    .line 302
    invoke-static {v14, v13}, Ljava/lang/Math;->min(II)I

    move-result v14

    shl-int/lit8 v14, v14, 0x2

    sub-int v15, v6, p2

    sub-int/2addr v15, v12

    move/from16 v21, v14

    move v14, v0

    move v0, v15

    move/from16 v15, v21

    :goto_5f
    or-int/lit8 v2, v9, 0x20

    const/16 v4, 0x70

    if-ne v2, v4, :cond_67

    move v2, v12

    goto :goto_68

    :cond_67
    const/4 v2, 0x0

    :goto_68
    if-eqz v2, :cond_a9

    add-int/lit8 v4, v6, 0x1

    .line 310
    invoke-static {v1, v4, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v5

    const/16 v9, 0x2d

    if-ne v5, v9, :cond_77

    move/from16 v17, v12

    goto :goto_79

    :cond_77
    const/16 v17, 0x0

    :goto_79
    if-nez v17, :cond_7f

    const/16 v9, 0x2b

    if-ne v5, v9, :cond_85

    :cond_7f
    add-int/lit8 v4, v6, 0x2

    .line 313
    invoke-static {v1, v4, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v5

    .line 315
    :cond_85
    invoke-static {v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v18

    const/4 v9, 0x0

    :cond_8a
    if-ge v9, v13, :cond_91

    mul-int/lit8 v9, v9, 0xa

    add-int/2addr v9, v5

    add-int/lit8 v9, v9, -0x30

    :cond_91
    add-int/2addr v4, v12

    .line 321
    invoke-static {v1, v4, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v5

    .line 322
    invoke-static {v5}, Lcom/fasterxml/jackson/core/io/doubleparser/FastDoubleSwar;->isDigit(C)Z

    move-result v19

    if-nez v19, :cond_8a

    if-eqz v17, :cond_9f

    neg-int v9, v9

    :cond_9f
    add-int/2addr v15, v9

    xor-int/lit8 v13, v18, 0x1

    or-int/2addr v10, v13

    move/from16 v21, v9

    move v9, v5

    move/from16 v5, v21

    goto :goto_ab

    :cond_a9
    move v4, v6

    const/4 v5, 0x0

    :goto_ab
    const/16 v13, 0x64

    if-ne v9, v13, :cond_b1

    move v13, v12

    goto :goto_b2

    :cond_b1
    const/4 v13, 0x0

    :goto_b2
    const/16 v12, 0x44

    if-ne v9, v12, :cond_b8

    const/4 v12, 0x1

    goto :goto_b9

    :cond_b8
    const/4 v12, 0x0

    :goto_b9
    const/16 v11, 0x66

    move-wide/from16 v19, v7

    if-ne v9, v11, :cond_c1

    const/4 v11, 0x1

    goto :goto_c2

    :cond_c1
    const/4 v11, 0x0

    :goto_c2
    const/16 v7, 0x46

    if-ne v9, v7, :cond_c8

    const/4 v7, 0x1

    goto :goto_c9

    :cond_c8
    const/4 v7, 0x0

    :goto_c9
    or-int v8, v12, v13

    or-int/2addr v8, v11

    or-int/2addr v7, v8

    if-eqz v7, :cond_d1

    add-int/lit8 v4, v4, 0x1

    .line 338
    :cond_d1
    invoke-static {v1, v4, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->skipWhitespace(Ljava/lang/CharSequence;II)I

    move-result v4

    if-nez v10, :cond_12f

    if-lt v4, v3, :cond_12f

    if-eqz v0, :cond_12f

    if-eqz v2, :cond_12f

    const/16 v2, 0x10

    if-le v0, v2, :cond_115

    move/from16 v0, p2

    const/4 v2, 0x0

    const-wide/16 v7, 0x0

    :goto_e6
    if-ge v0, v6, :cond_108

    .line 352
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 354
    invoke-static {v4}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->lookupHex(C)I

    move-result v4

    if-ltz v4, :cond_102

    const-wide v9, 0xde0b6b3a7640000L

    .line 356
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v9

    if-gez v9, :cond_108

    const/4 v9, 0x4

    shl-long/2addr v7, v9

    int-to-long v10, v4

    or-long/2addr v7, v10

    goto :goto_105

    :cond_102
    const/4 v9, 0x4

    add-int/lit8 v2, v2, 0x1

    :goto_105
    add-int/lit8 v0, v0, 0x1

    goto :goto_e6

    :cond_108
    if-lt v0, v6, :cond_10d

    const/16 v16, 0x0

    goto :goto_10f

    :cond_10d
    const/16 v16, 0x1

    :goto_10f
    move v4, v0

    move-wide/from16 v19, v7

    move/from16 v8, v16

    goto :goto_117

    :cond_115
    const/4 v2, 0x0

    const/4 v8, 0x0

    :goto_117
    sub-int/2addr v14, v4

    add-int/2addr v14, v2

    shl-int/lit8 v0, v14, 0x2

    add-int v9, v0, v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    move-wide/from16 v5, v19

    move v7, v15

    .line 370
    invoke-virtual/range {v0 .. v9}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->valueOfHexLiteral(Ljava/lang/CharSequence;IIZJIZI)J

    move-result-wide v0

    return-wide v0

    .line 342
    :cond_12f
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "illegal syntax"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private parseNaNOrInfinity(Ljava/lang/CharSequence;IIZ)J
    .registers 9

    .line 376
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x4e

    if-ne v0, v1, :cond_29

    add-int/lit8 p4, p2, 0x2

    if-ge p4, p3, :cond_89

    add-int/lit8 v0, p2, 0x1

    .line 379
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v2, 0x61

    if-ne v0, v2, :cond_89

    .line 380
    invoke-interface {p1, p4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p4

    if-ne p4, v1, :cond_89

    add-int/lit8 p2, p2, 0x3

    .line 382
    invoke-static {p1, p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->skipWhitespace(Ljava/lang/CharSequence;II)I

    move-result p1

    if-ne p1, p3, :cond_89

    .line 384
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->nan()J

    move-result-wide p0

    return-wide p0

    :cond_29
    add-int/lit8 v0, p2, 0x7

    if-ge v0, p3, :cond_89

    .line 389
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x49

    if-ne v1, v2, :cond_89

    add-int/lit8 v1, p2, 0x1

    .line 390
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x6e

    if-ne v1, v2, :cond_89

    add-int/lit8 v1, p2, 0x2

    .line 391
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v3, 0x66

    if-ne v1, v3, :cond_89

    add-int/lit8 v1, p2, 0x3

    .line 392
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v3, 0x69

    if-ne v1, v3, :cond_89

    add-int/lit8 v1, p2, 0x4

    .line 393
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_89

    add-int/lit8 v1, p2, 0x5

    .line 394
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, v3, :cond_89

    add-int/lit8 v1, p2, 0x6

    .line 395
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x74

    if-ne v1, v2, :cond_89

    .line 396
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x79

    if-ne v0, v1, :cond_89

    add-int/lit8 p2, p2, 0x8

    .line 398
    invoke-static {p1, p2, p3}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->skipWhitespace(Ljava/lang/CharSequence;II)I

    move-result p1

    if-ne p1, p3, :cond_89

    if-eqz p4, :cond_84

    .line 400
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->negativeInfinity()J

    move-result-wide p0

    return-wide p0

    :cond_84
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->positiveInfinity()J

    move-result-wide p0

    return-wide p0

    .line 404
    :cond_89
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string p1, "illegal syntax"

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static skipWhitespace(Ljava/lang/CharSequence;II)I
    .registers 5

    :goto_0
    if-ge p1, p2, :cond_d

    .line 28
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_d

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_d
    return p1
.end method


# virtual methods
.method abstract nan()J
.end method

.method abstract negativeInfinity()J
.end method

.method public final parseFloatingPointLiteral(Ljava/lang/CharSequence;II)J
    .registers 12

    add-int v4, p2, p3

    if-ltz p2, :cond_78

    if-lt v4, p2, :cond_78

    .line 198
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt v4, v0, :cond_78

    const v0, 0x7ffffffb

    if-gt p3, v0, :cond_78

    .line 204
    invoke-static {p1, p2, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->skipWhitespace(Ljava/lang/CharSequence;II)I

    move-result p3

    .line 205
    const-string v0, "illegal syntax"

    if-eq p3, v4, :cond_72

    .line 208
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x2d

    const/4 v3, 0x0

    const/4 v5, 0x1

    if-eq v1, v2, :cond_25

    move v6, v3

    goto :goto_26

    :cond_25
    move v6, v5

    :goto_26
    if-nez v6, :cond_2c

    const/16 v2, 0x2b

    if-ne v1, v2, :cond_34

    :cond_2c
    add-int/lit8 p3, p3, 0x1

    .line 214
    invoke-static {p1, p3, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v1

    if-eqz v1, :cond_6c

    :cond_34
    const/16 v0, 0x49

    if-lt v1, v0, :cond_3d

    .line 223
    invoke-direct {p0, p1, p3, v4, v6}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->parseNaNOrInfinity(Ljava/lang/CharSequence;IIZ)J

    move-result-wide p0

    return-wide p0

    :cond_3d
    const/16 v0, 0x30

    if-ne v1, v0, :cond_43

    move v7, v5

    goto :goto_44

    :cond_43
    move v7, v3

    :goto_44
    if-eqz v7, :cond_61

    add-int/lit8 v0, p3, 0x1

    .line 230
    invoke-static {p1, v0, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->charAt(Ljava/lang/CharSequence;II)C

    move-result v1

    const/16 v2, 0x78

    if-eq v1, v2, :cond_56

    const/16 v2, 0x58

    if-eq v1, v2, :cond_56

    move v2, v0

    goto :goto_62

    :cond_56
    add-int/lit8 v2, p3, 0x2

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v5, v6

    .line 232
    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->parseHexFloatLiteral(Ljava/lang/CharSequence;IIIZ)J

    move-result-wide p0

    return-wide p0

    :cond_61
    move v2, p3

    :goto_62
    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v5, v6

    move v6, v7

    .line 236
    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/core/io/doubleparser/AbstractJavaFloatingPointBitsFromCharSequence;->parseDecFloatLiteral(Ljava/lang/CharSequence;IIIZZ)J

    move-result-wide p0

    return-wide p0

    .line 216
    :cond_6c
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 206
    :cond_72
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 199
    :cond_78
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "offset < 0 or length > str.length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method abstract positiveInfinity()J
.end method

.method abstract valueOfFloatLiteral(Ljava/lang/CharSequence;IIZJIZI)J
.end method

.method abstract valueOfHexLiteral(Ljava/lang/CharSequence;IIZJIZI)J
.end method
