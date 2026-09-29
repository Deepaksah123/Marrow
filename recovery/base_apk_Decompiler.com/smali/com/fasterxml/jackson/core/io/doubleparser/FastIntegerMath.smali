###### Class com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath (com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath)
.class Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;
    }
.end annotation


# static fields
.field public static final FIVE:Ljava/math/BigInteger;

.field static final FIVE_POW_16:Ljava/math/BigInteger;

.field private static final SMALL_POWERS_OF_TEN:[Ljava/math/BigInteger;

.field static final TEN_POW_16:Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .registers 18

    const-wide/16 v0, 0x5

    .line 14
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->FIVE:Ljava/math/BigInteger;

    const-wide v0, 0x2386f26fc10000L

    .line 15
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->TEN_POW_16:Ljava/math/BigInteger;

    const-wide v0, 0x2386f26fc1L

    .line 16
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->FIVE_POW_16:Ljava/math/BigInteger;

    .line 17
    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    sget-object v2, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    const-wide/16 v3, 0x64

    .line 20
    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    const-wide/16 v4, 0x3e8

    .line 21
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    const-wide/16 v5, 0x2710

    .line 22
    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v5

    const-wide/32 v6, 0x186a0

    .line 23
    invoke-static {v6, v7}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v6

    const-wide/32 v7, 0xf4240

    .line 24
    invoke-static {v7, v8}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    const-wide/32 v8, 0x989680

    .line 25
    invoke-static {v8, v9}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v8

    const-wide/32 v9, 0x5f5e100

    .line 26
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v9

    const-wide/32 v10, 0x3b9aca00

    .line 27
    invoke-static {v10, v11}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v10

    const-wide v11, 0x2540be400L

    .line 28
    invoke-static {v11, v12}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v11

    const-wide v12, 0x174876e800L

    .line 29
    invoke-static {v12, v13}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v12

    const-wide v13, 0xe8d4a51000L

    .line 30
    invoke-static {v13, v14}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v13

    const-wide v14, 0x9184e72a000L

    .line 31
    invoke-static {v14, v15}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v14

    const-wide v15, 0x5af3107a4000L

    .line 32
    invoke-static/range {v15 .. v16}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v15

    const-wide v16, 0x38d7ea4c68000L

    .line 33
    invoke-static/range {v16 .. v17}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v16

    filled-new-array/range {v1 .. v16}, [Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->SMALL_POWERS_OF_TEN:[Ljava/math/BigInteger;

    return-void
.end method

.method static computePowerOfTen(Ljava/util/NavigableMap;I)Ljava/math/BigInteger;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/NavigableMap<",
            "Ljava/lang/Integer;",
            "Ljava/math/BigInteger;",
            ">;I)",
            "Ljava/math/BigInteger;"
        }
    .end annotation

    .line 51
    sget-object v0, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->SMALL_POWERS_OF_TEN:[Ljava/math/BigInteger;

    array-length v1, v0

    if-ge p1, v1, :cond_8

    .line 52
    aget-object p0, v0, p1

    return-object p0

    :cond_8
    if-eqz p0, :cond_39

    .line 55
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/NavigableMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 57
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_25

    .line 58
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/math/BigInteger;

    return-object p0

    .line 60
    :cond_25
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-static {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->computePowerOfTen(Ljava/util/NavigableMap;I)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->multiply(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 63
    :cond_39
    sget-object p0, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->FIVE:Ljava/math/BigInteger;

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method static computeTenRaisedByNFloor16Recursive(Ljava/util/NavigableMap;I)Ljava/math/BigInteger;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/NavigableMap<",
            "Ljava/lang/Integer;",
            "Ljava/math/BigInteger;",
            ">;I)",
            "Ljava/math/BigInteger;"
        }
    .end annotation

    and-int/lit8 p1, p1, -0x10

    .line 71
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/NavigableMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    .line 72
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 73
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/math/BigInteger;

    if-ne v1, p1, :cond_1d

    return-object v0

    :cond_1d
    sub-int/2addr p1, v1

    .line 78
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/NavigableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/math/BigInteger;

    if-nez v1, :cond_35

    .line 80
    invoke-static {p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->computeTenRaisedByNFloor16Recursive(Ljava/util/NavigableMap;I)Ljava/math/BigInteger;

    move-result-object v1

    .line 81
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1, v1}, Ljava/util/NavigableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    :cond_35
    invoke-static {v0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FftMultiplier;->multiply(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method static createPowersOfTenFloor16Map()Ljava/util/NavigableMap;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/NavigableMap<",
            "Ljava/lang/Integer;",
            "Ljava/math/BigInteger;",
            ">;"
        }
    .end annotation

    .line 88
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    const/4 v1, 0x0

    .line 89
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-interface {v0, v1, v2}, Ljava/util/NavigableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x10

    .line 90
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->TEN_POW_16:Ljava/math/BigInteger;

    invoke-interface {v0, v1, v2}, Ljava/util/NavigableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static estimateNumBits(J)J
    .registers 4

    const-wide/16 v0, 0xd4a

    mul-long/2addr p0, v0

    const/16 v0, 0xa

    ushr-long/2addr p0, v0

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    return-wide p0
.end method

.method static fillPowersOf10Floor16(II)Ljava/util/NavigableMap;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/NavigableMap<",
            "Ljava/lang/Integer;",
            "Ljava/math/BigInteger;",
            ">;"
        }
    .end annotation

    .line 111
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    const/4 v1, 0x0

    .line 112
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-wide/16 v2, 0x5

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/NavigableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x10

    .line 113
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->FIVE_POW_16:Ljava/math/BigInteger;

    invoke-interface {v0, v1, v2}, Ljava/util/NavigableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    invoke-static {v0, p0, p1}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->fillPowersOfNFloor16Recursive(Ljava/util/NavigableMap;II)V

    .line 117
    invoke-interface {v0}, Ljava/util/NavigableMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_29
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4d

    .line 118
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    .line 119
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/math/BigInteger;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_29

    :cond_4d
    return-object v0
.end method

.method static fillPowersOfNFloor16Recursive(Ljava/util/NavigableMap;II)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/NavigableMap<",
            "Ljava/lang/Integer;",
            "Ljava/math/BigInteger;",
            ">;II)V"
        }
    .end annotation

    sub-int v0, p2, p1

    const/16 v1, 0x12

    if-le v0, v1, :cond_27

    .line 132
    invoke-static {p1, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->splitFloor16(II)I

    move-result v0

    sub-int v1, p2, v0

    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/NavigableMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    .line 135
    invoke-static {p0, p1, v0}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->fillPowersOfNFloor16Recursive(Ljava/util/NavigableMap;II)V

    .line 136
    invoke-static {p0, v0, p2}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->fillPowersOfNFloor16Recursive(Ljava/util/NavigableMap;II)V

    .line 137
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0, v1}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;->computeTenRaisedByNFloor16Recursive(Ljava/util/NavigableMap;I)Ljava/math/BigInteger;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/NavigableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_27
    return-void
.end method

.method static fullMultiplication(JJ)Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;
    .registers 26

    const/4 v0, 0x0

    int-to-long v1, v0

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    const/4 v4, -0x1

    int-to-long v5, v4

    const/16 v7, 0x3f

    shr-long v8, v5, v7

    shl-long/2addr v8, v3

    sub-long/2addr v5, v8

    or-long/2addr v1, v5

    and-long v1, p0, v1

    ushr-long v5, p0, v3

    int-to-long v8, v0

    shl-long/2addr v8, v3

    int-to-long v10, v4

    shr-long v12, v10, v7

    shl-long/2addr v12, v3

    sub-long/2addr v10, v12

    or-long/2addr v8, v10

    and-long v8, p2, v8

    ushr-long v10, p2, v3

    mul-long v12, v10, v1

    mul-long/2addr v1, v8

    mul-long/2addr v8, v5

    ushr-long v14, v1, v3

    add-long/2addr v8, v14

    int-to-long v14, v0

    shl-long/2addr v14, v3

    move-wide/from16 p0, v1

    int-to-long v0, v4

    shr-long v16, v0, v7

    shl-long v16, v16, v3

    sub-long v0, v0, v16

    or-long/2addr v0, v14

    and-long/2addr v0, v12

    add-long/2addr v8, v0

    .line 163
    new-instance v0, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;

    mul-long/2addr v5, v10

    ushr-long v1, v8, v3

    add-long/2addr v5, v1

    ushr-long v1, v12, v3

    add-long v17, v5, v1

    shl-long v1, v8, v3

    const/4 v5, 0x0

    int-to-long v5, v5

    shl-long/2addr v5, v3

    int-to-long v8, v4

    shr-long v10, v8, v7

    shl-long v3, v10, v3

    sub-long/2addr v8, v3

    or-long v3, v5, v8

    move-wide/from16 v5, p0

    and-long/2addr v3, v5

    or-long v19, v1, v3

    const/16 v21, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v21}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;-><init>(JJLcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$1;)V

    return-object v0
.end method

.method static splitFloor16(II)I
    .registers 2

    add-int/2addr p0, p1

    ushr-int/lit8 p0, p0, 0x1

    sub-int p0, p1, p0

    add-int/lit8 p0, p0, 0xf

    shr-int/lit8 p0, p0, 0x4

    shl-int/lit8 p0, p0, 0x4

    sub-int/2addr p1, p0

    return p1
.end method

###### Class com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath.AnonymousClass1 (com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath$1)
.class synthetic Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation

###### Class com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath.UInt128 (com.fasterxml.jackson.core.io.doubleparser.FastIntegerMath$UInt128)
.class Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "UInt128"
.end annotation


# instance fields
.field final high:J

.field final low:J


# direct methods
.method private constructor <init>(JJ)V
    .registers 5

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    iput-wide p1, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;->high:J

    .line 181
    iput-wide p3, p0, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;->low:J

    return-void
.end method

.method synthetic constructor <init>(JJLcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$1;)V
    .registers 6

    .line 176
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/core/io/doubleparser/FastIntegerMath$UInt128;-><init>(JJ)V

    return-void
.end method
