###### Class com.fasterxml.jackson.core.io.JsonStringEncoder (com.fasterxml.jackson.core.io.JsonStringEncoder)
.class public final Lcom/fasterxml/jackson/core/io/JsonStringEncoder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final HB:[B

.field private static final HC:[C

.field private static final instance:Lcom/fasterxml/jackson/core/io/JsonStringEncoder;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const/4 v0, 0x1

    .line 25
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/CharTypes;->copyHexChars(Z)[C

    move-result-object v1

    sput-object v1, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HC:[C

    .line 27
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/CharTypes;->copyHexBytes(Z)[B

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HB:[B

    .line 50
    new-instance v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->instance:Lcom/fasterxml/jackson/core/io/JsonStringEncoder;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private _appendByte(IILcom/fasterxml/jackson/core/util/ByteArrayBuilder;I)I
    .registers 5

    .line 636
    invoke-virtual {p3, p4}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->setCurrentSegmentLength(I)V

    const/16 p0, 0x5c

    .line 637
    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    if-gez p2, :cond_41

    const/16 p0, 0x75

    .line 639
    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    const/16 p0, 0xff

    if-le p1, p0, :cond_28

    .line 642
    sget-object p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HB:[B

    shr-int/lit8 p2, p1, 0xc

    aget-byte p2, p0, p2

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    shr-int/lit8 p2, p1, 0x8

    and-int/lit8 p2, p2, 0xf

    .line 643
    aget-byte p0, p0, p2

    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    and-int/lit16 p1, p1, 0xff

    goto :goto_30

    :cond_28
    const/16 p0, 0x30

    .line 646
    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 647
    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 649
    :goto_30
    sget-object p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HB:[B

    shr-int/lit8 p2, p1, 0x4

    aget-byte p2, p0, p2

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    and-int/lit8 p1, p1, 0xf

    .line 650
    aget-byte p0, p0, p1

    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    goto :goto_45

    :cond_41
    int-to-byte p0, p2

    .line 652
    invoke-virtual {p3, p0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    .line 654
    :goto_45
    invoke-virtual {p3}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->getCurrentSegmentLength()I

    move-result p0

    return p0
.end method

.method private _appendNamed(I[C)I
    .registers 3

    int-to-char p0, p1

    const/4 p1, 0x1

    .line 630
    aput-char p0, p2, p1

    const/4 p0, 0x2

    return p0
.end method

.method private _appendNumeric(I[C)I
    .registers 5

    const/4 p0, 0x1

    const/16 v0, 0x75

    .line 622
    aput-char v0, p2, p0

    .line 624
    sget-object p0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->HC:[C

    shr-int/lit8 v0, p1, 0x4

    aget-char v0, p0, v0

    const/4 v1, 0x4

    aput-char v0, p2, v1

    and-int/lit8 p1, p1, 0xf

    .line 625
    aget-char p0, p0, p1

    const/4 p1, 0x5

    aput-char p0, p2, p1

    const/4 p0, 0x6

    return p0
.end method

.method private static _convert(II)I
    .registers 5

    const v0, 0xdc00

    if-lt p1, v0, :cond_16

    const v1, 0xdfff

    if-gt p1, v1, :cond_16

    const v1, 0xd800

    sub-int/2addr p0, v1

    shl-int/lit8 p0, p0, 0xa

    const/high16 v1, 0x10000

    add-int/2addr p0, v1

    sub-int/2addr p1, v0

    add-int/2addr p0, p1

    return p0

    .line 660
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Broken surrogate pair: first char 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", second 0x"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "; illegal combination"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static _illegal(I)V
    .registers 2

    .line 666
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->illegalSurrogateDesc(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static _initialByteBufSize(I)I
    .registers 2

    add-int/lit8 v0, p0, 0x6

    shr-int/lit8 p0, p0, 0x1

    add-int/2addr v0, p0

    const/16 p0, 0x18

    .line 682
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/16 v0, 0x7d00

    .line 684
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method static _initialCharBufSize(I)I
    .registers 3

    shr-int/lit8 v0, p0, 0x3

    add-int/lit8 v0, v0, 0x6

    const/16 v1, 0x3e8

    .line 674
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/16 v1, 0x10

    add-int/2addr p0, v0

    .line 673
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/16 v0, 0x7d00

    .line 675
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method private _qbuf()[C
    .registers 3

    const/4 p0, 0x6

    .line 614
    new-array p0, p0, [C

    const/4 v0, 0x0

    const/16 v1, 0x5c

    .line 615
    aput-char v1, p0, v0

    const/4 v0, 0x2

    const/16 v1, 0x30

    .line 616
    aput-char v1, p0, v0

    const/4 v0, 0x3

    .line 617
    aput-char v1, p0, v0

    return-object p0
.end method

.method public static getInstance()Lcom/fasterxml/jackson/core/io/JsonStringEncoder;
    .registers 1

    .line 61
    sget-object v0, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->instance:Lcom/fasterxml/jackson/core/io/JsonStringEncoder;

    return-object v0
.end method


# virtual methods
.method public final encodeAsUTF8(Ljava/lang/String;)[B
    .registers 12

    .line 418
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    .line 420
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_initialByteBufSize(I)I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_e
    if-ge v5, p0, :cond_e9

    add-int/lit8 v6, v5, 0x1

    .line 426
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_16
    const/16 v7, 0x7f

    if-gt v5, v7, :cond_3d

    if-lt v4, v0, :cond_2b

    if-nez v2, :cond_22

    .line 432
    invoke-static {v1, v4}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->fromInitial([BI)Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    move-result-object v2

    .line 434
    :cond_22
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v0

    .line 435
    array-length v1, v0

    move v4, v3

    move v9, v1

    move-object v1, v0

    move v0, v9

    :cond_2b
    add-int/lit8 v7, v4, 0x1

    int-to-byte v5, v5

    .line 438
    aput-byte v5, v1, v4

    if-lt v6, p0, :cond_35

    move v4, v7

    goto/16 :goto_e9

    .line 442
    :cond_35
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    add-int/lit8 v6, v6, 0x1

    move v4, v7

    goto :goto_16

    :cond_3d
    if-nez v2, :cond_43

    .line 447
    invoke-static {v1, v4}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->fromInitial([BI)Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    move-result-object v2

    :cond_43
    if-lt v4, v0, :cond_4b

    .line 450
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    .line 451
    array-length v0, v1

    move v4, v3

    :cond_4b
    const/16 v7, 0x800

    if-ge v5, v7, :cond_5a

    add-int/lit8 v7, v4, 0x1

    shr-int/lit8 v8, v5, 0x6

    or-int/lit16 v8, v8, 0xc0

    int-to-byte v8, v8

    .line 455
    aput-byte v8, v1, v4

    goto/16 :goto_cf

    :cond_5a
    const v7, 0xd800

    if-lt v5, v7, :cond_b3

    const v7, 0xdfff

    if-gt v5, v7, :cond_b3

    const v7, 0xdbff

    if-le v5, v7, :cond_6c

    .line 468
    invoke-static {v5}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_illegal(I)V

    :cond_6c
    if-lt v6, p0, :cond_71

    .line 472
    invoke-static {v5}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_illegal(I)V

    .line 474
    :cond_71
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v5, v7}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_convert(II)I

    move-result v5

    const v7, 0x10ffff

    if-le v5, v7, :cond_81

    .line 476
    invoke-static {v5}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_illegal(I)V

    :cond_81
    add-int/lit8 v7, v4, 0x1

    shr-int/lit8 v8, v5, 0x12

    or-int/lit16 v8, v8, 0xf0

    int-to-byte v8, v8

    .line 478
    aput-byte v8, v1, v4

    if-lt v7, v0, :cond_92

    .line 480
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    .line 481
    array-length v0, v1

    move v7, v3

    :cond_92
    add-int/lit8 v4, v7, 0x1

    shr-int/lit8 v8, v5, 0xc

    and-int/lit8 v8, v8, 0x3f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    .line 484
    aput-byte v8, v1, v7

    if-lt v4, v0, :cond_a5

    .line 486
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    .line 487
    array-length v0, v1

    move v4, v3

    :cond_a5
    shr-int/lit8 v7, v5, 0x6

    and-int/lit8 v7, v7, 0x3f

    or-int/lit16 v7, v7, 0x80

    int-to-byte v7, v7

    .line 490
    aput-byte v7, v1, v4

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_d0

    :cond_b3
    add-int/lit8 v7, v4, 0x1

    shr-int/lit8 v8, v5, 0xc

    or-int/lit16 v8, v8, 0xe0

    int-to-byte v8, v8

    .line 459
    aput-byte v8, v1, v4

    if-lt v7, v0, :cond_c4

    .line 461
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    .line 462
    array-length v0, v1

    move v7, v3

    :cond_c4
    shr-int/lit8 v4, v5, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    .line 465
    aput-byte v4, v1, v7

    add-int/lit8 v7, v7, 0x1

    :goto_cf
    move v4, v7

    :goto_d0
    move v9, v6

    move v6, v5

    move v5, v9

    if-lt v4, v0, :cond_de

    .line 494
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v0

    .line 495
    array-length v1, v0

    move v4, v3

    move v9, v1

    move-object v1, v0

    move v0, v9

    :cond_de
    and-int/lit8 v6, v6, 0x3f

    or-int/lit16 v6, v6, 0x80

    int-to-byte v6, v6

    .line 498
    aput-byte v6, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_e

    :cond_e9
    :goto_e9
    if-nez v2, :cond_f0

    .line 501
    invoke-static {v1, v3, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    return-object p0

    .line 503
    :cond_f0
    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->completeAndCoalesce(I)[B

    move-result-object p0

    return-object p0
.end method

.method public final quoteAsString(Ljava/lang/String;)[C
    .registers 14

    .line 80
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 81
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_initialCharBufSize(I)I

    move-result v1

    new-array v1, v1, [C

    .line 82
    invoke-static {}, Lcom/fasterxml/jackson/core/io/CharTypes;->get7BitOutputEscapes()[I

    move-result-object v2

    .line 83
    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v4

    move v7, v5

    move v8, v7

    :goto_14
    if-ge v8, v0, :cond_80

    .line 93
    :cond_16
    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ge v9, v3, :cond_61

    .line 94
    aget v10, v2, v9

    if-eqz v10, :cond_61

    if-nez v6, :cond_26

    .line 116
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_qbuf()[C

    move-result-object v6

    .line 118
    :cond_26
    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 119
    aget v10, v2, v9

    if-gez v10, :cond_33

    .line 121
    invoke-direct {p0, v9, v6}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_appendNumeric(I[C)I

    move-result v9

    goto :goto_37

    .line 122
    :cond_33
    invoke-direct {p0, v10, v6}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_appendNamed(I[C)I

    move-result v9

    :goto_37
    add-int v10, v7, v9

    .line 124
    array-length v11, v1

    if-le v10, v11, :cond_5a

    .line 125
    array-length v10, v1

    sub-int/2addr v10, v7

    if-lez v10, :cond_43

    .line 127
    invoke-static {v6, v5, v1, v7, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_43
    if-nez v4, :cond_49

    .line 130
    invoke-static {v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->fromInitial([C)Lcom/fasterxml/jackson/core/util/TextBuffer;

    move-result-object v4

    .line 133
    :cond_49
    :try_start_49
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/TextBuffer;->finishCurrentSegment()[C

    move-result-object v1
    :try_end_4d
    .catch Ljava/io/IOException; {:try_start_49 .. :try_end_4d} :catch_53

    sub-int/2addr v9, v10

    .line 139
    invoke-static {v6, v10, v1, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v7, v9

    goto :goto_5e

    :catch_53
    move-exception p0

    .line 136
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 142
    :cond_5a
    invoke-static {v6, v5, v1, v7, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v7, v10

    :goto_5e
    add-int/lit8 v8, v8, 0x1

    goto :goto_14

    .line 97
    :cond_61
    array-length v10, v1

    if-lt v7, v10, :cond_77

    if-nez v4, :cond_6a

    .line 99
    invoke-static {v1}, Lcom/fasterxml/jackson/core/util/TextBuffer;->fromInitial([C)Lcom/fasterxml/jackson/core/util/TextBuffer;

    move-result-object v4

    .line 102
    :cond_6a
    :try_start_6a
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/TextBuffer;->finishCurrentSegment()[C

    move-result-object v1
    :try_end_6e
    .catch Ljava/io/IOException; {:try_start_6a .. :try_end_6e} :catch_70

    move v7, v5

    goto :goto_77

    :catch_70
    move-exception p0

    .line 105
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_77
    :goto_77
    add-int/lit8 v10, v7, 0x1

    .line 109
    aput-char v9, v1, v7

    add-int/lit8 v8, v8, 0x1

    move v7, v10

    if-lt v8, v0, :cond_16

    :cond_80
    if-nez v4, :cond_87

    .line 148
    invoke-static {v1, v5, v7}, Ljava/util/Arrays;->copyOfRange([CII)[C

    move-result-object p0

    return-object p0

    .line 150
    :cond_87
    invoke-virtual {v4, v7}, Lcom/fasterxml/jackson/core/util/TextBuffer;->setCurrentLength(I)V

    .line 152
    :try_start_8a
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/util/TextBuffer;->contentsAsArray()[C

    move-result-object p0
    :try_end_8e
    .catch Ljava/io/IOException; {:try_start_8a .. :try_end_8e} :catch_8f

    return-object p0

    :catch_8f
    move-exception p0

    .line 155
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final quoteAsUTF8(Ljava/lang/String;)[B
    .registers 13

    .line 312
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 314
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_initialByteBufSize(I)I

    move-result v1

    new-array v1, v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_e
    if-ge v5, v0, :cond_101

    .line 319
    invoke-static {}, Lcom/fasterxml/jackson/core/io/CharTypes;->get7BitOutputEscapes()[I

    move-result-object v6

    .line 323
    :cond_14
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x7f

    if-gt v7, v8, :cond_3a

    .line 324
    aget v9, v6, v7

    if-nez v9, :cond_3a

    .line 327
    array-length v8, v1

    if-lt v4, v8, :cond_2e

    if-nez v2, :cond_29

    .line 329
    invoke-static {v1, v4}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->fromInitial([BI)Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    move-result-object v2

    .line 331
    :cond_29
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v4, v3

    :cond_2e
    add-int/lit8 v8, v4, 0x1

    int-to-byte v7, v7

    .line 334
    aput-byte v7, v1, v4

    add-int/lit8 v5, v5, 0x1

    move v4, v8

    if-lt v5, v0, :cond_14

    goto/16 :goto_101

    :cond_3a
    if-nez v2, :cond_40

    .line 340
    invoke-static {v1, v4}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->fromInitial([BI)Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    move-result-object v2

    .line 342
    :cond_40
    array-length v7, v1

    if-lt v4, v7, :cond_48

    .line 343
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v4, v3

    :cond_48
    add-int/lit8 v7, v5, 0x1

    .line 347
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-gt v9, v8, :cond_5f

    .line 349
    aget v1, v6, v9

    .line 351
    invoke-direct {p0, v9, v1, v2, v4}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_appendByte(IILcom/fasterxml/jackson/core/util/ByteArrayBuilder;I)I

    move-result v1

    .line 352
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->getCurrentSegment()[B

    move-result-object v4

    move v5, v7

    move-object v10, v4

    move v4, v1

    move-object v1, v10

    goto :goto_e

    :cond_5f
    const/16 v6, 0x7ff

    if-gt v9, v6, :cond_72

    add-int/lit8 v5, v4, 0x1

    shr-int/lit8 v6, v9, 0x6

    or-int/lit16 v6, v6, 0xc0

    int-to-byte v6, v6

    .line 356
    aput-byte v6, v1, v4

    :goto_6c
    and-int/lit8 v4, v9, 0x3f

    or-int/lit16 v4, v4, 0x80

    goto/16 :goto_f0

    :cond_72
    const v6, 0xd800

    if-lt v9, v6, :cond_d2

    const v6, 0xdfff

    if-gt v9, v6, :cond_d2

    const v6, 0xdbff

    if-le v9, v6, :cond_84

    .line 370
    invoke-static {v9}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_illegal(I)V

    :cond_84
    if-lt v7, v0, :cond_89

    .line 374
    invoke-static {v9}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_illegal(I)V

    .line 376
    :cond_89
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v9, v6}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_convert(II)I

    move-result v6

    const v7, 0x10ffff

    if-le v6, v7, :cond_99

    .line 378
    invoke-static {v6}, Lcom/fasterxml/jackson/core/io/JsonStringEncoder;->_illegal(I)V

    :cond_99
    add-int/lit8 v7, v4, 0x1

    shr-int/lit8 v8, v6, 0x12

    or-int/lit16 v8, v8, 0xf0

    int-to-byte v8, v8

    .line 380
    aput-byte v8, v1, v4

    .line 381
    array-length v4, v1

    if-lt v7, v4, :cond_aa

    .line 382
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v7, v3

    :cond_aa
    add-int/lit8 v4, v7, 0x1

    shr-int/lit8 v8, v6, 0xc

    and-int/lit8 v8, v8, 0x3f

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    .line 385
    aput-byte v8, v1, v7

    .line 386
    array-length v7, v1

    if-lt v4, v7, :cond_bd

    .line 387
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v4, v3

    :cond_bd
    shr-int/lit8 v7, v6, 0x6

    and-int/lit8 v7, v7, 0x3f

    or-int/lit16 v7, v7, 0x80

    int-to-byte v7, v7

    .line 390
    aput-byte v7, v1, v4

    and-int/lit8 v6, v6, 0x3f

    or-int/lit16 v6, v6, 0x80

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x2

    move v7, v5

    move v5, v4

    move v4, v6

    goto :goto_f0

    :cond_d2
    add-int/lit8 v5, v4, 0x1

    shr-int/lit8 v6, v9, 0xc

    or-int/lit16 v6, v6, 0xe0

    int-to-byte v6, v6

    .line 361
    aput-byte v6, v1, v4

    .line 362
    array-length v4, v1

    if-lt v5, v4, :cond_e3

    .line 363
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v5, v3

    :cond_e3
    shr-int/lit8 v4, v9, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/lit16 v4, v4, 0x80

    int-to-byte v4, v4

    .line 366
    aput-byte v4, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_6c

    .line 394
    :goto_f0
    array-length v6, v1

    if-lt v5, v6, :cond_f8

    .line 395
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v1

    move v5, v3

    :cond_f8
    int-to-byte v4, v4

    .line 398
    aput-byte v4, v1, v5

    add-int/lit8 v5, v5, 0x1

    move v4, v5

    move v5, v7

    goto/16 :goto_e

    :cond_101
    :goto_101
    if-nez v2, :cond_108

    .line 401
    invoke-static {v1, v3, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    return-object p0

    .line 403
    :cond_108
    invoke-virtual {v2, v4}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->completeAndCoalesce(I)[B

    move-result-object p0

    return-object p0
.end method
