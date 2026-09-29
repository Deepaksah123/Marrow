###### Class com.fasterxml.jackson.core.io.NumberOutput (com.fasterxml.jackson.core.io.NumberOutput)
.class public final Lcom/fasterxml/jackson/core/io/NumberOutput;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static BILLION:I = 0x3b9aca00

.field private static BILLION_L:J = 0x3b9aca00L

.field private static MAX_INT_AS_LONG:J = 0x7fffffffL

.field private static MILLION:I = 0xf4240

.field private static MIN_INT_AS_LONG:J = -0x80000000L

.field static final SMALLEST_INT:Ljava/lang/String; = "-2147483648"

.field static final SMALLEST_LONG:Ljava/lang/String; = "-9223372036854775808"

.field private static final TRIPLET_TO_CHARS:[I

.field private static final sSmallIntStrs:[Ljava/lang/String;

.field private static final sSmallIntStrs2:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 14

    const/16 v0, 0x3e8

    .line 24
    new-array v0, v0, [I

    sput-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_9
    const/16 v3, 0xa

    if-ge v1, v3, :cond_2e

    move v4, v0

    :goto_e
    if-ge v4, v3, :cond_2b

    move v5, v0

    :goto_11
    if-ge v5, v3, :cond_28

    .line 36
    sget-object v6, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    add-int/lit8 v7, v1, 0x30

    shl-int/lit8 v7, v7, 0x10

    add-int/lit8 v8, v4, 0x30

    shl-int/lit8 v8, v8, 0x8

    or-int/2addr v7, v8

    add-int/lit8 v8, v5, 0x30

    or-int/2addr v7, v8

    aput v7, v6, v2

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_11

    :cond_28
    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    :cond_2b
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    .line 42
    :cond_2e
    const-string v3, "0"

    const-string v4, "1"

    const-string v5, "2"

    const-string v6, "3"

    const-string v7, "4"

    const-string v8, "5"

    const-string v9, "6"

    const-string v10, "7"

    const-string v11, "8"

    const-string v12, "9"

    const-string v13, "10"

    filled-new-array/range {v3 .. v13}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->sSmallIntStrs:[Ljava/lang/String;

    .line 45
    const-string v1, "-1"

    const-string v2, "-2"

    const-string v3, "-3"

    const-string v4, "-4"

    const-string v5, "-5"

    const-string v6, "-6"

    const-string v7, "-7"

    const-string v8, "-8"

    const-string v9, "-9"

    const-string v10, "-10"

    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->sSmallIntStrs2:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static _full3(I[BI)I
    .registers 5

    .line 539
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    aget p0, v0, p0

    shr-int/lit8 v0, p0, 0x10

    int-to-byte v0, v0

    .line 540
    aput-byte v0, p1, p2

    shr-int/lit8 v0, p0, 0x8

    int-to-byte v0, v0

    add-int/lit8 v1, p2, 0x1

    .line 541
    aput-byte v0, p1, v1

    int-to-byte p0, p0

    add-int/lit8 v0, p2, 0x2

    .line 542
    aput-byte p0, p1, v0

    add-int/lit8 p2, p2, 0x3

    return p2
.end method

.method private static _full3(I[CI)I
    .registers 5

    .line 530
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    aget p0, v0, p0

    shr-int/lit8 v0, p0, 0x10

    int-to-char v0, v0

    .line 531
    aput-char v0, p1, p2

    shr-int/lit8 v0, p0, 0x8

    and-int/lit8 v0, v0, 0x7f

    int-to-char v0, v0

    add-int/lit8 v1, p2, 0x1

    .line 532
    aput-char v0, p1, v1

    and-int/lit8 p0, p0, 0x7f

    int-to-char p0, p0

    add-int/lit8 v0, p2, 0x2

    .line 533
    aput-char p0, p1, v0

    add-int/lit8 p2, p2, 0x3

    return p2
.end method

.method private static _leading3(I[BI)I
    .registers 5

    .line 517
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    aget v0, v0, p0

    const/16 v1, 0x9

    if-le p0, v1, :cond_1a

    const/16 v1, 0x63

    if-le p0, v1, :cond_13

    shr-int/lit8 p0, v0, 0x10

    int-to-byte p0, p0

    .line 520
    aput-byte p0, p1, p2

    add-int/lit8 p2, p2, 0x1

    :cond_13
    shr-int/lit8 p0, v0, 0x8

    int-to-byte p0, p0

    .line 522
    aput-byte p0, p1, p2

    add-int/lit8 p2, p2, 0x1

    :cond_1a
    int-to-byte p0, v0

    .line 524
    aput-byte p0, p1, p2

    add-int/lit8 p2, p2, 0x1

    return p2
.end method

.method private static _leading3(I[CI)I
    .registers 5

    .line 504
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    aget v0, v0, p0

    const/16 v1, 0x9

    if-le p0, v1, :cond_1c

    const/16 v1, 0x63

    if-le p0, v1, :cond_13

    shr-int/lit8 p0, v0, 0x10

    int-to-char p0, p0

    .line 507
    aput-char p0, p1, p2

    add-int/lit8 p2, p2, 0x1

    :cond_13
    shr-int/lit8 p0, v0, 0x8

    and-int/lit8 p0, p0, 0x7f

    int-to-char p0, p0

    .line 509
    aput-char p0, p1, p2

    add-int/lit8 p2, p2, 0x1

    :cond_1c
    and-int/lit8 p0, v0, 0x7f

    int-to-char p0, p0

    .line 511
    aput-char p0, p1, p2

    add-int/lit8 p2, p2, 0x1

    return p2
.end method

.method private static _outputFullBillion(I[BI)I
    .registers 9

    .line 443
    div-int/lit16 v0, p0, 0x3e8

    .line 445
    div-int/lit16 v1, v0, 0x3e8

    .line 448
    sget-object v2, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    aget v3, v2, v1

    shr-int/lit8 v4, v3, 0x10

    int-to-byte v4, v4

    .line 449
    aput-byte v4, p1, p2

    shr-int/lit8 v4, v3, 0x8

    int-to-byte v4, v4

    add-int/lit8 v5, p2, 0x1

    .line 450
    aput-byte v4, p1, v5

    int-to-byte v3, v3

    add-int/lit8 v4, p2, 0x2

    .line 451
    aput-byte v3, p1, v4

    mul-int/lit16 v1, v1, 0x3e8

    sub-int v1, v0, v1

    .line 453
    aget v1, v2, v1

    shr-int/lit8 v3, v1, 0x10

    int-to-byte v3, v3

    add-int/lit8 v4, p2, 0x3

    .line 454
    aput-byte v3, p1, v4

    shr-int/lit8 v3, v1, 0x8

    int-to-byte v3, v3

    add-int/lit8 v4, p2, 0x4

    .line 455
    aput-byte v3, p1, v4

    int-to-byte v1, v1

    add-int/lit8 v3, p2, 0x5

    .line 456
    aput-byte v1, p1, v3

    mul-int/lit16 v0, v0, 0x3e8

    sub-int/2addr p0, v0

    .line 458
    aget p0, v2, p0

    shr-int/lit8 v0, p0, 0x10

    int-to-byte v0, v0

    add-int/lit8 v1, p2, 0x6

    .line 459
    aput-byte v0, p1, v1

    shr-int/lit8 v0, p0, 0x8

    int-to-byte v0, v0

    add-int/lit8 v1, p2, 0x7

    .line 460
    aput-byte v0, p1, v1

    int-to-byte p0, p0

    add-int/lit8 v0, p2, 0x8

    .line 461
    aput-byte p0, p1, v0

    add-int/lit8 p2, p2, 0x9

    return p2
.end method

.method private static _outputFullBillion(I[CI)I
    .registers 9

    .line 388
    div-int/lit16 v0, p0, 0x3e8

    .line 390
    div-int/lit16 v1, v0, 0x3e8

    .line 392
    sget-object v2, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    aget v3, v2, v1

    shr-int/lit8 v4, v3, 0x10

    int-to-char v4, v4

    .line 393
    aput-char v4, p1, p2

    shr-int/lit8 v4, v3, 0x8

    and-int/lit8 v4, v4, 0x7f

    int-to-char v4, v4

    add-int/lit8 v5, p2, 0x1

    .line 394
    aput-char v4, p1, v5

    and-int/lit8 v3, v3, 0x7f

    int-to-char v3, v3

    add-int/lit8 v4, p2, 0x2

    .line 395
    aput-char v3, p1, v4

    mul-int/lit16 v1, v1, 0x3e8

    sub-int v1, v0, v1

    .line 398
    aget v1, v2, v1

    shr-int/lit8 v3, v1, 0x10

    int-to-char v3, v3

    add-int/lit8 v4, p2, 0x3

    .line 399
    aput-char v3, p1, v4

    shr-int/lit8 v3, v1, 0x8

    and-int/lit8 v3, v3, 0x7f

    int-to-char v3, v3

    add-int/lit8 v4, p2, 0x4

    .line 400
    aput-char v3, p1, v4

    and-int/lit8 v1, v1, 0x7f

    int-to-char v1, v1

    add-int/lit8 v3, p2, 0x5

    .line 401
    aput-char v1, p1, v3

    mul-int/lit16 v0, v0, 0x3e8

    sub-int/2addr p0, v0

    .line 403
    aget p0, v2, p0

    shr-int/lit8 v0, p0, 0x10

    int-to-char v0, v0

    add-int/lit8 v1, p2, 0x6

    .line 404
    aput-char v0, p1, v1

    shr-int/lit8 v0, p0, 0x8

    and-int/lit8 v0, v0, 0x7f

    int-to-char v0, v0

    add-int/lit8 v1, p2, 0x7

    .line 405
    aput-char v0, p1, v1

    and-int/lit8 p0, p0, 0x7f

    int-to-char p0, p0

    add-int/lit8 v0, p2, 0x8

    .line 406
    aput-char p0, p1, v0

    add-int/lit8 p2, p2, 0x9

    return p2
.end method

.method private static _outputSmallestI([BI)I
    .registers 5

    .line 573
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->SMALLEST_INT:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_17

    .line 575
    sget-object v2, Lcom/fasterxml/jackson/core/io/NumberOutput;->SMALLEST_INT:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, p0, p1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    :cond_17
    return p1
.end method

.method private static _outputSmallestI([CI)I
    .registers 5

    .line 566
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->SMALLEST_INT:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    .line 567
    invoke-virtual {v0, v2, v1, p0, p1}, Ljava/lang/String;->getChars(II[CI)V

    add-int/2addr p1, v1

    return p1
.end method

.method private static _outputSmallestL([BI)I
    .registers 5

    .line 557
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->SMALLEST_LONG:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_17

    .line 559
    sget-object v2, Lcom/fasterxml/jackson/core/io/NumberOutput;->SMALLEST_LONG:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, p0, p1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    :cond_17
    return p1
.end method

.method private static _outputSmallestL([CI)I
    .registers 5

    .line 550
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->SMALLEST_LONG:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    .line 551
    invoke-virtual {v0, v2, v1, p0, p1}, Ljava/lang/String;->getChars(II[CI)V

    add-int/2addr p1, v1

    return p1
.end method

.method private static _outputUptoBillion(I[BI)I
    .registers 9

    .line 413
    sget v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->MILLION:I

    const/16 v1, 0x3e8

    if-ge p0, v0, :cond_17

    if-ge p0, v1, :cond_d

    .line 415
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[BI)I

    move-result p0

    return p0

    .line 417
    :cond_d
    div-int/lit16 v0, p0, 0x3e8

    mul-int/lit16 v1, v0, 0x3e8

    sub-int/2addr p0, v1

    .line 419
    invoke-static {p1, p2, v0, p0}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputUptoMillion([BIII)I

    move-result p0

    return p0

    .line 421
    :cond_17
    div-int/lit16 v0, p0, 0x3e8

    .line 423
    div-int/lit16 v2, v0, 0x3e8

    .line 426
    invoke-static {v2, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[BI)I

    move-result p2

    .line 428
    sget-object v3, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    mul-int/2addr v2, v1

    sub-int v2, v0, v2

    aget v2, v3, v2

    shr-int/lit8 v4, v2, 0x10

    int-to-byte v4, v4

    .line 429
    aput-byte v4, p1, p2

    shr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    add-int/lit8 v5, p2, 0x1

    .line 430
    aput-byte v4, p1, v5

    int-to-byte v2, v2

    add-int/lit8 v4, p2, 0x2

    .line 431
    aput-byte v2, p1, v4

    mul-int/2addr v0, v1

    sub-int/2addr p0, v0

    .line 433
    aget p0, v3, p0

    shr-int/lit8 v0, p0, 0x10

    int-to-byte v0, v0

    add-int/lit8 v1, p2, 0x3

    .line 434
    aput-byte v0, p1, v1

    shr-int/lit8 v0, p0, 0x8

    int-to-byte v0, v0

    add-int/lit8 v1, p2, 0x4

    .line 435
    aput-byte v0, p1, v1

    int-to-byte p0, p0

    add-int/lit8 v0, p2, 0x5

    .line 436
    aput-byte p0, p1, v0

    add-int/lit8 p2, p2, 0x6

    return p2
.end method

.method private static _outputUptoBillion(I[CI)I
    .registers 9

    .line 358
    sget v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->MILLION:I

    const/16 v1, 0x3e8

    if-ge p0, v0, :cond_17

    if-ge p0, v1, :cond_d

    .line 360
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[CI)I

    move-result p0

    return p0

    .line 362
    :cond_d
    div-int/lit16 v0, p0, 0x3e8

    mul-int/lit16 v1, v0, 0x3e8

    sub-int/2addr p0, v1

    .line 364
    invoke-static {p1, p2, v0, p0}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputUptoMillion([CIII)I

    move-result p0

    return p0

    .line 366
    :cond_17
    div-int/lit16 v0, p0, 0x3e8

    .line 368
    div-int/lit16 v2, v0, 0x3e8

    .line 371
    invoke-static {v2, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[CI)I

    move-result p2

    .line 373
    sget-object v3, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    mul-int/2addr v2, v1

    sub-int v2, v0, v2

    aget v2, v3, v2

    shr-int/lit8 v4, v2, 0x10

    int-to-char v4, v4

    .line 374
    aput-char v4, p1, p2

    shr-int/lit8 v4, v2, 0x8

    and-int/lit8 v4, v4, 0x7f

    int-to-char v4, v4

    add-int/lit8 v5, p2, 0x1

    .line 375
    aput-char v4, p1, v5

    and-int/lit8 v2, v2, 0x7f

    int-to-char v2, v2

    add-int/lit8 v4, p2, 0x2

    .line 376
    aput-char v2, p1, v4

    mul-int/2addr v0, v1

    sub-int/2addr p0, v0

    .line 378
    aget p0, v3, p0

    shr-int/lit8 v0, p0, 0x10

    int-to-char v0, v0

    add-int/lit8 v1, p2, 0x3

    .line 379
    aput-char v0, p1, v1

    shr-int/lit8 v0, p0, 0x8

    and-int/lit8 v0, v0, 0x7f

    int-to-char v0, v0

    add-int/lit8 v1, p2, 0x4

    .line 380
    aput-char v0, p1, v1

    and-int/lit8 p0, p0, 0x7f

    int-to-char p0, p0

    add-int/lit8 v0, p2, 0x5

    .line 381
    aput-char p0, p1, v0

    add-int/lit8 p2, p2, 0x6

    return p2
.end method

.method private static _outputUptoMillion([BIII)I
    .registers 7

    .line 486
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    aget v1, v0, p2

    const/16 v2, 0x9

    if-le p2, v2, :cond_1a

    const/16 v2, 0x63

    if-le p2, v2, :cond_13

    shr-int/lit8 p2, v1, 0x10

    int-to-byte p2, p2

    .line 489
    aput-byte p2, p0, p1

    add-int/lit8 p1, p1, 0x1

    :cond_13
    shr-int/lit8 p2, v1, 0x8

    int-to-byte p2, p2

    .line 491
    aput-byte p2, p0, p1

    add-int/lit8 p1, p1, 0x1

    :cond_1a
    int-to-byte p2, v1

    .line 493
    aput-byte p2, p0, p1

    .line 495
    aget p2, v0, p3

    shr-int/lit8 p3, p2, 0x10

    int-to-byte p3, p3

    add-int/lit8 v0, p1, 0x1

    .line 496
    aput-byte p3, p0, v0

    shr-int/lit8 p3, p2, 0x8

    int-to-byte p3, p3

    add-int/lit8 v0, p1, 0x2

    .line 497
    aput-byte p3, p0, v0

    int-to-byte p2, p2

    add-int/lit8 p3, p1, 0x3

    .line 498
    aput-byte p2, p0, p3

    add-int/lit8 p1, p1, 0x4

    return p1
.end method

.method private static _outputUptoMillion([CIII)I
    .registers 7

    .line 468
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->TRIPLET_TO_CHARS:[I

    aget v1, v0, p2

    const/16 v2, 0x9

    if-le p2, v2, :cond_1c

    const/16 v2, 0x63

    if-le p2, v2, :cond_13

    shr-int/lit8 p2, v1, 0x10

    int-to-char p2, p2

    .line 471
    aput-char p2, p0, p1

    add-int/lit8 p1, p1, 0x1

    :cond_13
    shr-int/lit8 p2, v1, 0x8

    and-int/lit8 p2, p2, 0x7f

    int-to-char p2, p2

    .line 473
    aput-char p2, p0, p1

    add-int/lit8 p1, p1, 0x1

    :cond_1c
    and-int/lit8 p2, v1, 0x7f

    int-to-char p2, p2

    .line 475
    aput-char p2, p0, p1

    .line 477
    aget p2, v0, p3

    shr-int/lit8 p3, p2, 0x10

    int-to-char p3, p3

    add-int/lit8 v0, p1, 0x1

    .line 478
    aput-char p3, p0, v0

    shr-int/lit8 p3, p2, 0x8

    and-int/lit8 p3, p3, 0x7f

    int-to-char p3, p3

    add-int/lit8 v0, p1, 0x2

    .line 479
    aput-char p3, p0, v0

    and-int/lit8 p2, p2, 0x7f

    int-to-char p2, p2

    add-int/lit8 p3, p1, 0x3

    .line 480
    aput-char p2, p0, p3

    add-int/lit8 p1, p1, 0x4

    return p1
.end method

.method public static notFinite(D)Z
    .registers 2

    .line 333
    invoke-static {p0, p1}, Ljava/lang/Double;->isFinite(D)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static notFinite(F)Z
    .registers 1

    .line 347
    invoke-static {p0}, Ljava/lang/Float;->isFinite(F)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static outputInt(I[BI)I
    .registers 6

    if-gez p0, :cond_12

    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_b

    .line 125
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputSmallestI([BI)I

    move-result p0

    return p0

    :cond_b
    const/16 v0, 0x2d

    .line 127
    aput-byte v0, p1, p2

    neg-int p0, p0

    add-int/lit8 p2, p2, 0x1

    .line 131
    :cond_12
    sget v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->MILLION:I

    const/16 v1, 0x3e8

    if-ge p0, v0, :cond_38

    if-ge p0, v1, :cond_2b

    const/16 v0, 0xa

    if-ge p0, v0, :cond_26

    add-int/lit8 p0, p0, 0x30

    int-to-byte p0, p0

    .line 134
    aput-byte p0, p1, p2

    add-int/lit8 p2, p2, 0x1

    return p2

    .line 136
    :cond_26
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[BI)I

    move-result p0

    return p0

    .line 139
    :cond_2b
    div-int/lit16 v0, p0, 0x3e8

    .line 141
    invoke-static {v0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[BI)I

    move-result p2

    mul-int/2addr v0, v1

    sub-int/2addr p0, v0

    .line 142
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_full3(I[BI)I

    move-result p0

    return p0

    .line 146
    :cond_38
    sget v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->BILLION:I

    if-lt p0, v0, :cond_52

    sub-int/2addr p0, v0

    if-lt p0, v0, :cond_47

    sub-int/2addr p0, v0

    add-int/lit8 v0, p2, 0x1

    const/16 v1, 0x32

    .line 150
    aput-byte v1, p1, p2

    goto :goto_4d

    :cond_47
    add-int/lit8 v0, p2, 0x1

    const/16 v1, 0x31

    .line 152
    aput-byte v1, p1, p2

    .line 154
    :goto_4d
    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputFullBillion(I[BI)I

    move-result p0

    return p0

    .line 156
    :cond_52
    div-int/lit16 v0, p0, 0x3e8

    .line 159
    div-int/lit16 v2, v0, 0x3e8

    .line 161
    invoke-static {v2, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[BI)I

    move-result p2

    mul-int/2addr v2, v1

    sub-int v2, v0, v2

    .line 162
    invoke-static {v2, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_full3(I[BI)I

    move-result p2

    mul-int/2addr v0, v1

    sub-int/2addr p0, v0

    .line 163
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_full3(I[BI)I

    move-result p0

    return p0
.end method

.method public static outputInt(I[CI)I
    .registers 6

    if-gez p0, :cond_12

    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_b

    .line 74
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputSmallestI([CI)I

    move-result p0

    return p0

    :cond_b
    const/16 v0, 0x2d

    .line 76
    aput-char v0, p1, p2

    neg-int p0, p0

    add-int/lit8 p2, p2, 0x1

    .line 80
    :cond_12
    sget v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->MILLION:I

    const/16 v1, 0x3e8

    if-ge p0, v0, :cond_38

    if-ge p0, v1, :cond_2b

    const/16 v0, 0xa

    if-ge p0, v0, :cond_26

    add-int/lit8 p0, p0, 0x30

    int-to-char p0, p0

    .line 83
    aput-char p0, p1, p2

    add-int/lit8 p2, p2, 0x1

    return p2

    .line 86
    :cond_26
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[CI)I

    move-result p0

    return p0

    .line 88
    :cond_2b
    div-int/lit16 v0, p0, 0x3e8

    .line 90
    invoke-static {v0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[CI)I

    move-result p2

    mul-int/2addr v0, v1

    sub-int/2addr p0, v0

    .line 91
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_full3(I[CI)I

    move-result p0

    return p0

    .line 100
    :cond_38
    sget v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->BILLION:I

    if-lt p0, v0, :cond_52

    sub-int/2addr p0, v0

    if-lt p0, v0, :cond_47

    sub-int/2addr p0, v0

    add-int/lit8 v0, p2, 0x1

    const/16 v1, 0x32

    .line 104
    aput-char v1, p1, p2

    goto :goto_4d

    :cond_47
    add-int/lit8 v0, p2, 0x1

    const/16 v1, 0x31

    .line 106
    aput-char v1, p1, p2

    .line 108
    :goto_4d
    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputFullBillion(I[CI)I

    move-result p0

    return p0

    .line 110
    :cond_52
    div-int/lit16 v0, p0, 0x3e8

    .line 113
    div-int/lit16 v2, v0, 0x3e8

    .line 116
    invoke-static {v2, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[CI)I

    move-result p2

    mul-int/2addr v2, v1

    sub-int v2, v0, v2

    .line 117
    invoke-static {v2, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_full3(I[CI)I

    move-result p2

    mul-int/2addr v0, v1

    sub-int/2addr p0, v0

    .line 118
    invoke-static {p0, p1, p2}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_full3(I[CI)I

    move-result p0

    return p0
.end method

.method public static outputLong(J[BI)I
    .registers 11

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gez v0, :cond_25

    .line 217
    sget-wide v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->MIN_INT_AS_LONG:J

    cmp-long v0, p0, v0

    if-lez v0, :cond_12

    long-to-int p0, p0

    .line 218
    invoke-static {p0, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->outputInt(I[BI)I

    move-result p0

    return p0

    :cond_12
    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p0, v0

    if-nez v0, :cond_1d

    .line 221
    invoke-static {p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputSmallestL([BI)I

    move-result p0

    return p0

    :cond_1d
    const/16 v0, 0x2d

    .line 223
    aput-byte v0, p2, p3

    neg-long p0, p0

    add-int/lit8 p3, p3, 0x1

    goto :goto_31

    .line 226
    :cond_25
    sget-wide v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->MAX_INT_AS_LONG:J

    cmp-long v0, p0, v0

    if-gtz v0, :cond_31

    long-to-int p0, p0

    .line 227
    invoke-static {p0, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->outputInt(I[BI)I

    move-result p0

    return p0

    .line 232
    :cond_31
    :goto_31
    sget-wide v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->BILLION_L:J

    div-long v2, p0, v0

    cmp-long v4, v2, v0

    if-gez v4, :cond_3f

    long-to-int v4, v2

    .line 237
    invoke-static {v4, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputUptoBillion(I[BI)I

    move-result p3

    goto :goto_4e

    .line 240
    :cond_3f
    div-long v4, v2, v0

    long-to-int v6, v4

    .line 242
    invoke-static {v6, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[BI)I

    move-result p3

    mul-long/2addr v4, v0

    sub-long v4, v2, v4

    long-to-int v4, v4

    .line 243
    invoke-static {v4, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputFullBillion(I[BI)I

    move-result p3

    :goto_4e
    mul-long/2addr v2, v0

    sub-long/2addr p0, v2

    long-to-int p0, p0

    .line 245
    invoke-static {p0, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputFullBillion(I[BI)I

    move-result p0

    return p0
.end method

.method public static outputLong(J[CI)I
    .registers 11

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gez v0, :cond_25

    .line 183
    sget-wide v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->MIN_INT_AS_LONG:J

    cmp-long v0, p0, v0

    if-lez v0, :cond_12

    long-to-int p0, p0

    .line 184
    invoke-static {p0, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->outputInt(I[CI)I

    move-result p0

    return p0

    :cond_12
    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p0, v0

    if-nez v0, :cond_1d

    .line 187
    invoke-static {p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputSmallestL([CI)I

    move-result p0

    return p0

    :cond_1d
    const/16 v0, 0x2d

    .line 189
    aput-char v0, p2, p3

    neg-long p0, p0

    add-int/lit8 p3, p3, 0x1

    goto :goto_31

    .line 192
    :cond_25
    sget-wide v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->MAX_INT_AS_LONG:J

    cmp-long v0, p0, v0

    if-gtz v0, :cond_31

    long-to-int p0, p0

    .line 193
    invoke-static {p0, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->outputInt(I[CI)I

    move-result p0

    return p0

    .line 198
    :cond_31
    :goto_31
    sget-wide v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->BILLION_L:J

    div-long v2, p0, v0

    cmp-long v4, v2, v0

    if-gez v4, :cond_3f

    long-to-int v4, v2

    .line 203
    invoke-static {v4, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputUptoBillion(I[CI)I

    move-result p3

    goto :goto_4e

    .line 206
    :cond_3f
    div-long v4, v2, v0

    long-to-int v6, v4

    .line 208
    invoke-static {v6, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_leading3(I[CI)I

    move-result p3

    mul-long/2addr v4, v0

    sub-long v4, v2, v4

    long-to-int v4, v4

    .line 209
    invoke-static {v4, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputFullBillion(I[CI)I

    move-result p3

    :goto_4e
    mul-long/2addr v2, v0

    sub-long/2addr p0, v2

    long-to-int p0, p0

    .line 211
    invoke-static {p0, p2, p3}, Lcom/fasterxml/jackson/core/io/NumberOutput;->_outputFullBillion(I[CI)I

    move-result p0

    return p0
.end method

.method public static toString(D)Ljava/lang/String;
    .registers 3

    const/4 v0, 0x0

    .line 284
    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/core/io/NumberOutput;->toString(DZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(DZ)Ljava/lang/String;
    .registers 3

    if-eqz p2, :cond_7

    .line 294
    invoke-static {p0, p1}, Lcom/fasterxml/jackson/core/io/schubfach/DoubleToDecimal;->toString(D)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {p0, p1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(F)Ljava/lang/String;
    .registers 2

    const/4 v0, 0x0

    .line 303
    invoke-static {p0, v0}, Lcom/fasterxml/jackson/core/io/NumberOutput;->toString(FZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(FZ)Ljava/lang/String;
    .registers 2

    if-eqz p1, :cond_7

    .line 313
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/schubfach/FloatToDecimal;->toString(F)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(I)Ljava/lang/String;
    .registers 4

    .line 260
    sget-object v0, Lcom/fasterxml/jackson/core/io/NumberOutput;->sSmallIntStrs:[Ljava/lang/String;

    array-length v1, v0

    if-ge p0, v1, :cond_15

    if-ltz p0, :cond_a

    .line 262
    aget-object p0, v0, p0

    return-object p0

    :cond_a
    neg-int v0, p0

    add-int/lit8 v0, v0, -0x1

    .line 265
    sget-object v1, Lcom/fasterxml/jackson/core/io/NumberOutput;->sSmallIntStrs2:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_15

    .line 266
    aget-object p0, v1, v0

    return-object p0

    .line 269
    :cond_15
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(J)Ljava/lang/String;
    .registers 4

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p0, v0

    if-gtz v0, :cond_14

    const-wide/32 v0, -0x80000000

    cmp-long v0, p0, v0

    if-ltz v0, :cond_14

    long-to-int p0, p0

    .line 274
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/NumberOutput;->toString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 276
    :cond_14
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
