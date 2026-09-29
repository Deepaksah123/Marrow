###### Class com.fasterxml.jackson.core.io.doubleparser.BigSignificand (com.fasterxml.jackson.core.io.doubleparser.BigSignificand)
.class Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private firstNonZeroInt:I

.field private final numInts:I

.field private final x:[I


# direct methods
.method public constructor <init>(J)V
    .registers 5

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_23

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-gez v0, :cond_23

    const-wide/16 v0, 0x3f

    add-long/2addr p1, v0

    const/4 v0, 0x6

    ushr-long/2addr p1, v0

    long-to-int p1, p1

    add-int/lit8 p1, p1, 0x1

    shl-int/lit8 p1, p1, 0x1

    .line 25
    iput p1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->numInts:I

    .line 26
    new-array p2, p1, [I

    iput-object p2, p0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x:[I

    .line 27
    iput p1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->firstNonZeroInt:I

    return-void

    .line 22
    :cond_23
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "numBits="

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private x(I)I
    .registers 2

    .line 87
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x:[I

    aget p0, p0, p1

    return p0
.end method

.method private x(II)V
    .registers 3

    .line 83
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x:[I

    aput p2, p0, p1

    return-void
.end method


# virtual methods
.method public add(I)V
    .registers 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    if-nez v1, :cond_7

    return-void

    :cond_7
    int-to-long v1, v1

    const/4 v3, 0x0

    int-to-long v4, v3

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    const/4 v7, -0x1

    int-to-long v8, v7

    const/16 v10, 0x3f

    shr-long v11, v8, v10

    shl-long/2addr v11, v6

    sub-long/2addr v8, v11

    or-long/2addr v4, v8

    and-long/2addr v1, v4

    .line 41
    iget v4, v0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->numInts:I

    add-int/lit8 v4, v4, -0x1

    :goto_1b
    const-wide/16 v8, 0x0

    cmp-long v5, v1, v8

    if-eqz v5, :cond_39

    .line 43
    invoke-direct {v0, v4}, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x(I)I

    move-result v5

    int-to-long v8, v5

    int-to-long v11, v3

    shl-long/2addr v11, v6

    int-to-long v13, v7

    shr-long v15, v13, v10

    shl-long/2addr v15, v6

    sub-long/2addr v13, v15

    or-long/2addr v11, v13

    and-long/2addr v8, v11

    add-long/2addr v8, v1

    long-to-int v1, v8

    .line 44
    invoke-direct {v0, v4, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x(II)V

    ushr-long v1, v8, v6

    add-int/lit8 v4, v4, -0x1

    goto :goto_1b

    .line 47
    :cond_39
    iget v1, v0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->firstNonZeroInt:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->firstNonZeroInt:I

    return-void
.end method

.method public fma(II)V
    .registers 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    int-to-long v1, v1

    move/from16 v3, p2

    int-to-long v3, v3

    .line 61
    iget v5, v0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->numInts:I

    add-int/lit8 v5, v5, -0x1

    .line 62
    :goto_c
    iget v6, v0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->firstNonZeroInt:I

    if-lt v5, v6, :cond_3a

    .line 63
    invoke-direct {v0, v5}, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x(I)I

    move-result v6

    int-to-long v6, v6

    const/4 v8, 0x0

    int-to-long v9, v8

    const/16 v11, 0x20

    shl-long/2addr v9, v11

    const/4 v12, -0x1

    int-to-long v13, v12

    const/16 v15, 0x3f

    shr-long v16, v13, v15

    shl-long v16, v16, v11

    sub-long v13, v13, v16

    or-long/2addr v9, v13

    and-long/2addr v6, v9

    int-to-long v8, v8

    shl-long/2addr v8, v11

    int-to-long v12, v12

    shr-long v14, v12, v15

    shl-long/2addr v14, v11

    sub-long/2addr v12, v14

    or-long/2addr v8, v12

    and-long/2addr v8, v1

    mul-long/2addr v6, v8

    add-long/2addr v6, v3

    long-to-int v3, v6

    .line 64
    invoke-direct {v0, v5, v3}, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x(II)V

    ushr-long v3, v6, v11

    add-int/lit8 v5, v5, -0x1

    goto :goto_c

    :cond_3a
    const-wide/16 v1, 0x0

    cmp-long v1, v3, v1

    if-eqz v1, :cond_46

    long-to-int v1, v3

    .line 68
    invoke-direct {v0, v5, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x(II)V

    .line 69
    iput v5, v0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->firstNonZeroInt:I

    :cond_46
    return-void
.end method

.method public toBigInteger()Ljava/math/BigInteger;
    .registers 6

    .line 74
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x:[I

    array-length v0, v0

    shl-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    .line 75
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    move-result-object v1

    const/4 v2, 0x0

    .line 76
    :goto_10
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/doubleparser/BigSignificand;->x:[I

    array-length v4, v3

    if-ge v2, v4, :cond_1d

    .line 77
    aget v3, v3, v2

    invoke-virtual {v1, v2, v3}, Ljava/nio/IntBuffer;->put(II)Ljava/nio/IntBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    .line 79
    :cond_1d
    new-instance p0, Ljava/math/BigInteger;

    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>([B)V

    return-object p0
.end method
