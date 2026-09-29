###### Class com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer (com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer)
.class public final Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;
    }
.end annotation


# instance fields
.field protected _count:I

.field protected final _failOnDoS:Z

.field protected _hashArea:[I

.field protected _hashShared:Z

.field protected _hashSize:I

.field protected final _intern:Z

.field protected _longNameOffset:I

.field protected _names:[Ljava/lang/String;

.field protected final _parent:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

.field protected _secondaryStart:I

.field protected final _seed:I

.field protected _spilloverEnd:I

.field protected final _tableInfo:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;",
            ">;"
        }
    .end annotation
.end field

.field protected _tertiaryShift:I

.field protected _tertiaryStart:I


# direct methods
.method private constructor <init>(II)V
    .registers 5

    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 230
    iput-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_parent:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    const/4 v0, 0x0

    .line 231
    iput v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    const/4 v1, 0x1

    .line 234
    iput-boolean v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashShared:Z

    .line 235
    iput p2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_seed:I

    .line 236
    iput-boolean v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_intern:Z

    .line 237
    iput-boolean v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_failOnDoS:Z

    const/16 p2, 0x10

    if-ge p1, p2, :cond_18

    :cond_16
    move p1, p2

    goto :goto_21

    :cond_18
    add-int/lit8 v0, p1, -0x1

    and-int/2addr v0, p1

    if-eqz v0, :cond_21

    :goto_1d
    if-ge p2, p1, :cond_16

    add-int/2addr p2, p2

    goto :goto_1d

    .line 252
    :cond_21
    :goto_21
    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->createInitial(I)Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tableInfo:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private constructor <init>(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;ILcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;ZZ)V
    .registers 6

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 262
    iput-object p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_parent:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    .line 263
    iput p2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_seed:I

    .line 264
    iput-boolean p4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_intern:Z

    .line 265
    iput-boolean p5, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_failOnDoS:Z

    const/4 p1, 0x0

    .line 266
    iput-object p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tableInfo:Ljava/util/concurrent/atomic/AtomicReference;

    .line 269
    iget p1, p3, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->count:I

    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    .line 270
    iget p1, p3, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->size:I

    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    shl-int/lit8 p1, p1, 0x2

    .line 271
    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    shr-int/lit8 p2, p1, 0x1

    add-int/2addr p1, p2

    .line 272
    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    .line 273
    iget p1, p3, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->tertiaryShift:I

    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryShift:I

    .line 275
    iget-object p1, p3, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->mainHash:[I

    iput-object p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    .line 276
    iget-object p1, p3, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->names:[Ljava/lang/String;

    iput-object p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    .line 278
    iget p1, p3, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->spilloverEnd:I

    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    .line 279
    iget p1, p3, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->longNameOffset:I

    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_longNameOffset:I

    const/4 p1, 0x1

    .line 282
    iput-boolean p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashShared:Z

    return-void
.end method

.method private _appendLongName([II)I
    .registers 8

    .line 1111
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_longNameOffset:I

    add-int v1, v0, p2

    .line 1114
    iget-object v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    array-length v3, v2

    if-le v1, v3, :cond_23

    .line 1116
    array-length v2, v2

    const/16 v3, 0x1000

    .line 1118
    iget v4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1120
    iget-object v4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    array-length v4, v4

    sub-int/2addr v1, v2

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1121
    iget-object v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    add-int/2addr v4, v1

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    :cond_23
    const/4 v1, 0x0

    .line 1123
    iget-object v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    invoke-static {p1, v1, v2, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1124
    iget p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_longNameOffset:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_longNameOffset:I

    return v0
.end method

.method private final _calcOffset(I)I
    .registers 2

    .line 710
    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    add-int/lit8 p0, p0, -0x1

    and-int/2addr p0, p1

    shl-int/lit8 p0, p0, 0x2

    return p0
.end method

.method static _calcTertiaryShift(I)I
    .registers 2

    shr-int/lit8 p0, p0, 0x2

    const/16 v0, 0x40

    if-ge p0, v0, :cond_8

    const/4 p0, 0x4

    return p0

    :cond_8
    const/16 v0, 0x100

    if-gt p0, v0, :cond_e

    const/4 p0, 0x5

    return p0

    :cond_e
    const/16 v0, 0x400

    if-gt p0, v0, :cond_14

    const/4 p0, 0x6

    return p0

    :cond_14
    const/4 p0, 0x7

    return p0
.end method

.method private _checkNeedForRehash()Z
    .registers 8

    .line 1099
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    const/4 v2, 0x1

    shr-int/2addr v1, v2

    if-le v0, v1, :cond_28

    .line 1100
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverStart()I

    move-result v1

    .line 1101
    iget v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    sub-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x2

    add-int/lit8 v1, v3, 0x1

    shr-int/lit8 v1, v1, 0x7

    if-gt v0, v1, :cond_27

    int-to-double v0, v3

    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    int-to-double v3, p0

    const-wide v5, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v3, v5

    cmpl-double p0, v0, v3

    if-lez p0, :cond_28

    :cond_27
    return v2

    :cond_28
    const/4 p0, 0x0

    return p0
.end method

.method private _findOffsetForAdd(I)I
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 1017
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_calcOffset(I)I

    move-result v0

    .line 1018
    iget-object v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    add-int/lit8 v2, v0, 0x3

    .line 1019
    aget v2, v1, v2

    if-nez v2, :cond_d

    return v0

    .line 1025
    :cond_d
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_checkNeedForRehash()Z

    move-result v2

    if-eqz v2, :cond_18

    .line 1026
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_resizeAndFindOffsetForAdd(I)I

    move-result p0

    return p0

    .line 1030
    :cond_18
    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    shr-int/lit8 v3, v0, 0x3

    shl-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    add-int/lit8 v3, v2, 0x3

    .line 1031
    aget v3, v1, v3

    if-nez v3, :cond_26

    return v2

    .line 1037
    :cond_26
    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    iget v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryShift:I

    add-int/lit8 v4, v3, 0x2

    shr-int/2addr v0, v4

    shl-int/2addr v0, v3

    add-int/2addr v2, v0

    move v0, v2

    :goto_30
    const/4 v4, 0x1

    shl-int/2addr v4, v3

    add-int/2addr v4, v2

    if-ge v0, v4, :cond_3f

    add-int/lit8 v4, v0, 0x3

    .line 1040
    aget v4, v1, v4

    if-nez v4, :cond_3c

    return v0

    :cond_3c
    add-int/lit8 v0, v0, 0x4

    goto :goto_30

    .line 1047
    :cond_3f
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    add-int/lit8 v1, v0, 0x4

    .line 1048
    iput v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    .line 1058
    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    shl-int/lit8 v2, v2, 0x3

    if-lt v1, v2, :cond_57

    .line 1060
    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_failOnDoS:Z

    if-eqz v0, :cond_52

    .line 1061
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_reportTooManyCollisions()V

    .line 1063
    :cond_52
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_resizeAndFindOffsetForAdd(I)I

    move-result p0

    return p0

    :cond_57
    return v0
.end method

.method private _findSecondary(II)Ljava/lang/String;
    .registers 10

    .line 727
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryShift:I

    add-int/lit8 v2, v1, 0x2

    shr-int/2addr p1, v2

    shl-int/2addr p1, v1

    add-int/2addr v0, p1

    .line 728
    iget-object p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    move v2, v0

    :goto_c
    const/4 v3, 0x1

    shl-int v4, v3, v1

    add-int/2addr v4, v0

    const/4 v5, 0x0

    if-ge v2, v4, :cond_2a

    add-int/lit8 v4, v2, 0x3

    .line 731
    aget v4, p1, v4

    .line 732
    aget v6, p1, v2

    if-ne p2, v6, :cond_24

    if-ne v3, v4, :cond_24

    .line 733
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v2, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_24
    if-nez v4, :cond_27

    return-object v5

    :cond_27
    add-int/lit8 v2, v2, 0x4

    goto :goto_c

    .line 742
    :cond_2a
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverStart()I

    move-result v0

    :goto_2e
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    if-ge v0, v1, :cond_46

    .line 743
    aget v1, p1, v0

    if-ne p2, v1, :cond_43

    add-int/lit8 v1, v0, 0x3

    aget v1, p1, v1

    if-ne v3, v1, :cond_43

    .line 744
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v0, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_43
    add-int/lit8 v0, v0, 0x4

    goto :goto_2e

    :cond_46
    return-object v5
.end method

.method private _findSecondary(III)Ljava/lang/String;
    .registers 11

    .line 752
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryShift:I

    add-int/lit8 v2, v1, 0x2

    shr-int/2addr p1, v2

    shl-int/2addr p1, v1

    add-int/2addr v0, p1

    .line 753
    iget-object p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    move v2, v0

    :goto_c
    const/4 v3, 0x1

    shl-int/2addr v3, v1

    add-int/2addr v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-ge v2, v3, :cond_30

    add-int/lit8 v3, v2, 0x3

    .line 757
    aget v3, p1, v3

    .line 758
    aget v6, p1, v2

    if-ne p2, v6, :cond_2a

    add-int/lit8 v6, v2, 0x1

    aget v6, p1, v6

    if-ne p3, v6, :cond_2a

    if-ne v5, v3, :cond_2a

    .line 759
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v2, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_2a
    if-nez v3, :cond_2d

    return-object v4

    :cond_2d
    add-int/lit8 v2, v2, 0x4

    goto :goto_c

    .line 765
    :cond_30
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverStart()I

    move-result v0

    :goto_34
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    if-ge v0, v1, :cond_52

    .line 766
    aget v1, p1, v0

    if-ne p2, v1, :cond_4f

    add-int/lit8 v1, v0, 0x1

    aget v1, p1, v1

    if-ne p3, v1, :cond_4f

    add-int/lit8 v1, v0, 0x3

    aget v1, p1, v1

    if-ne v5, v1, :cond_4f

    .line 767
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v0, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_4f
    add-int/lit8 v0, v0, 0x4

    goto :goto_34

    :cond_52
    return-object v4
.end method

.method private _findSecondary(IIII)Ljava/lang/String;
    .registers 12

    .line 775
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryShift:I

    add-int/lit8 v2, v1, 0x2

    shr-int/2addr p1, v2

    shl-int/2addr p1, v1

    add-int/2addr v0, p1

    .line 776
    iget-object p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    move v2, v0

    :goto_c
    const/4 v3, 0x1

    shl-int/2addr v3, v1

    add-int/2addr v3, v0

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-ge v2, v3, :cond_36

    add-int/lit8 v3, v2, 0x3

    .line 780
    aget v3, p1, v3

    .line 781
    aget v6, p1, v2

    if-ne p2, v6, :cond_30

    add-int/lit8 v6, v2, 0x1

    aget v6, p1, v6

    if-ne p3, v6, :cond_30

    add-int/lit8 v6, v2, 0x2

    aget v6, p1, v6

    if-ne p4, v6, :cond_30

    if-ne v5, v3, :cond_30

    .line 782
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v2, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_30
    if-nez v3, :cond_33

    return-object v4

    :cond_33
    add-int/lit8 v2, v2, 0x4

    goto :goto_c

    .line 788
    :cond_36
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverStart()I

    move-result v0

    :goto_3a
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    if-ge v0, v1, :cond_5e

    .line 789
    aget v1, p1, v0

    if-ne p2, v1, :cond_5b

    add-int/lit8 v1, v0, 0x1

    aget v1, p1, v1

    if-ne p3, v1, :cond_5b

    add-int/lit8 v1, v0, 0x2

    aget v1, p1, v1

    if-ne p4, v1, :cond_5b

    add-int/lit8 v1, v0, 0x3

    aget v1, p1, v1

    if-ne v5, v1, :cond_5b

    .line 791
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v0, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_5b
    add-int/lit8 v0, v0, 0x4

    goto :goto_3a

    :cond_5e
    return-object v4
.end method

.method private _findSecondary(II[II)Ljava/lang/String;
    .registers 11

    .line 799
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryShift:I

    add-int/lit8 v2, v1, 0x2

    shr-int/2addr p1, v2

    shl-int/2addr p1, v1

    add-int/2addr v0, p1

    .line 800
    iget-object p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    move v2, v0

    :goto_c
    const/4 v3, 0x1

    shl-int/2addr v3, v1

    add-int/2addr v3, v0

    const/4 v4, 0x0

    if-ge v2, v3, :cond_33

    add-int/lit8 v3, v2, 0x3

    .line 804
    aget v3, p1, v3

    .line 805
    aget v5, p1, v2

    if-ne p2, v5, :cond_2d

    if-ne p4, v3, :cond_2d

    add-int/lit8 v5, v2, 0x1

    .line 806
    aget v5, p1, v5

    invoke-direct {p0, p3, p4, v5}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_verifyLongName([III)Z

    move-result v5

    if-eqz v5, :cond_2d

    .line 807
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v2, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_2d
    if-nez v3, :cond_30

    return-object v4

    :cond_30
    add-int/lit8 v2, v2, 0x4

    goto :goto_c

    .line 814
    :cond_33
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverStart()I

    move-result v0

    :goto_37
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    if-ge v0, v1, :cond_59

    .line 815
    aget v1, p1, v0

    if-ne p2, v1, :cond_56

    add-int/lit8 v1, v0, 0x3

    aget v1, p1, v1

    if-ne p4, v1, :cond_56

    add-int/lit8 v1, v0, 0x1

    .line 816
    aget v1, p1, v1

    invoke-direct {p0, p3, p4, v1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_verifyLongName([III)Z

    move-result v1

    if-eqz v1, :cond_56

    .line 817
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v0, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_56
    add-int/lit8 v0, v0, 0x4

    goto :goto_37

    :cond_59
    return-object v4
.end method

.method private _resizeAndFindOffsetForAdd(I)I
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 1072
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->rehash()V

    .line 1075
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_calcOffset(I)I

    move-result p1

    .line 1076
    iget-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    add-int/lit8 v1, p1, 0x3

    .line 1077
    aget v1, v0, v1

    if-nez v1, :cond_10

    return p1

    .line 1080
    :cond_10
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    shr-int/lit8 v2, p1, 0x3

    shl-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    add-int/lit8 v2, v1, 0x3

    .line 1081
    aget v2, v0, v2

    if-nez v2, :cond_1e

    return v1

    .line 1084
    :cond_1e
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryShift:I

    add-int/lit8 v3, v2, 0x2

    shr-int/2addr p1, v3

    shl-int/2addr p1, v2

    add-int/2addr v1, p1

    move p1, v1

    :goto_28
    const/4 v3, 0x1

    shl-int/2addr v3, v2

    add-int/2addr v3, v1

    if-ge p1, v3, :cond_37

    add-int/lit8 v3, p1, 0x3

    .line 1087
    aget v3, v0, v3

    if-nez v3, :cond_34

    return p1

    :cond_34
    add-int/lit8 p1, p1, 0x4

    goto :goto_28

    .line 1091
    :cond_37
    iget p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    add-int/lit8 v0, p1, 0x4

    .line 1092
    iput v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    return p1
.end method

.method private final _spilloverStart()I
    .registers 2

    .line 1349
    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    shl-int/lit8 v0, p0, 0x3

    sub-int/2addr v0, p0

    return v0
.end method

.method private _verifyLongName([III)Z
    .registers 8

    .line 826
    iget-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch p2, :pswitch_data_66

    .line 832
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_verifyLongName2([III)Z

    move-result p0

    return p0

    .line 834
    :pswitch_c
    aget p0, p1, v2

    aget p2, v0, p3

    if-eq p0, p2, :cond_13

    return v2

    :cond_13
    add-int/lit8 p3, p3, 0x1

    move p0, v1

    goto :goto_18

    :pswitch_17
    move p0, v2

    :goto_18
    add-int/lit8 p2, p0, 0x1

    .line 836
    aget p0, p1, p0

    aget v3, v0, p3

    if-eq p0, v3, :cond_21

    return v2

    :cond_21
    add-int/2addr p3, v1

    goto :goto_24

    :pswitch_23
    move p2, v2

    :goto_24
    add-int/lit8 p0, p2, 0x1

    .line 838
    aget p2, p1, p2

    aget v3, v0, p3

    if-eq p2, v3, :cond_2d

    return v2

    :cond_2d
    add-int/2addr p3, v1

    goto :goto_30

    :pswitch_2f
    move p0, v2

    :goto_30
    add-int/lit8 p2, p0, 0x1

    .line 840
    aget p0, p1, p0

    aget v3, v0, p3

    if-eq p0, v3, :cond_39

    return v2

    :cond_39
    add-int/2addr p3, v1

    goto :goto_3c

    :pswitch_3b
    move p2, v2

    .line 842
    :goto_3c
    aget p0, p1, p2

    aget v3, v0, p3

    if-eq p0, v3, :cond_43

    return v2

    :cond_43
    add-int/lit8 p0, p2, 0x1

    .line 843
    aget p0, p1, p0

    add-int/lit8 v3, p3, 0x1

    aget v3, v0, v3

    if-eq p0, v3, :cond_4e

    return v2

    :cond_4e
    add-int/lit8 p0, p2, 0x2

    .line 844
    aget p0, p1, p0

    add-int/lit8 v3, p3, 0x2

    aget v3, v0, v3

    if-eq p0, v3, :cond_59

    return v2

    :cond_59
    add-int/lit8 p2, p2, 0x3

    .line 845
    aget p0, p1, p2

    add-int/lit8 p3, p3, 0x3

    aget p1, v0, p3

    if-eq p0, p1, :cond_64

    return v2

    :cond_64
    return v1

    nop

    :pswitch_data_66
    .packed-switch 0x4
        :pswitch_3b
        :pswitch_2f
        :pswitch_23
        :pswitch_17
        :pswitch_c
    .end packed-switch
.end method

.method private _verifyLongName2([III)Z
    .registers 8

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    add-int/lit8 v2, v1, 0x1

    .line 854
    aget v1, p1, v1

    iget-object v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    aget v3, v3, p3

    if-eq v1, v3, :cond_d

    return v0

    :cond_d
    if-lt v2, p2, :cond_11

    const/4 p0, 0x1

    return p0

    :cond_11
    add-int/lit8 p3, p3, 0x1

    move v1, v2

    goto :goto_2
.end method

.method private _verifySharing()V
    .registers 3

    .line 995
    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashShared:Z

    if-eqz v0, :cond_33

    .line 998
    iget-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_parent:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    if-nez v0, :cond_1c

    .line 999
    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    if-nez p0, :cond_14

    .line 1000
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Internal error: Cannot add names to Root symbol table"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1002
    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Internal error: Cannot add names to Placeholder symbol table"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1005
    :cond_1c
    iget-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    .line 1006
    iget-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    const/4 v0, 0x0

    .line 1007
    iput-boolean v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashShared:Z

    :cond_33
    return-void
.end method

.method public static createRoot()Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;
    .registers 4

    .line 342
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int v2, v0

    const/16 v3, 0x20

    ushr-long/2addr v0, v3

    long-to-int v0, v0

    add-int/2addr v2, v0

    or-int/lit8 v0, v2, 0x1

    .line 345
    invoke-static {v0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->createRoot(I)Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    move-result-object v0

    return-object v0
.end method

.method protected static createRoot(I)Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;
    .registers 3

    .line 351
    new-instance v0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    const/16 v1, 0x40

    invoke-direct {v0, v1, p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;-><init>(II)V

    return-object v0
.end method

.method private mergeChild(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;)V
    .registers 5

    .line 412
    iget v0, p1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->count:I

    .line 413
    iget-object v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tableInfo:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;

    .line 417
    iget v2, v1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->count:I

    if-ne v0, v2, :cond_f

    return-void

    :cond_f
    const/16 v2, 0x1770

    if-le v0, v2, :cond_19

    const/16 p1, 0x40

    .line 427
    invoke-static {p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->createInitial(I)Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;

    move-result-object p1

    .line 429
    :cond_19
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tableInfo:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p0, v1, p1}, Lo/setBackInvokedCallbackEnabled;->read(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private nukeSymbols(Z)V
    .registers 4

    const/4 v0, 0x0

    .line 1326
    iput v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    .line 1328
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverStart()I

    move-result v1

    iput v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    .line 1330
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    shl-int/lit8 v1, v1, 0x3

    iput v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_longNameOffset:I

    if-eqz p1, :cond_1c

    .line 1332
    iget-object p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([II)V

    .line 1333
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1c
    return-void
.end method

.method private rehash()V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1243
    iput-boolean v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashShared:Z

    .line 1247
    iget-object v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    .line 1248
    iget-object v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    .line 1249
    iget v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    .line 1250
    iget v4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    add-int v5, v3, v3

    .line 1252
    iget v6, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    const/high16 v7, 0x10000

    const/4 v8, 0x1

    if-le v5, v7, :cond_18

    .line 1258
    invoke-direct {p0, v8}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->nukeSymbols(Z)V

    return-void

    .line 1262
    :cond_18
    array-length v7, v1

    const/4 v9, 0x3

    shl-int/2addr v3, v9

    add-int/2addr v7, v3

    new-array v3, v7, [I

    iput-object v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    .line 1263
    iput v5, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    shl-int/lit8 v3, v5, 0x2

    .line 1264
    iput v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    shr-int/lit8 v7, v3, 0x1

    add-int/2addr v3, v7

    .line 1265
    iput v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    .line 1266
    invoke-static {v5}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_calcTertiaryShift(I)I

    move-result v3

    iput v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryShift:I

    .line 1269
    array-length v3, v2

    shl-int/2addr v3, v8

    new-array v3, v3, [Ljava/lang/String;

    iput-object v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    .line 1270
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->nukeSymbols(Z)V

    const/16 v3, 0x10

    .line 1278
    new-array v3, v3, [I

    move v5, v0

    move v7, v5

    :goto_40
    if-ge v5, v6, :cond_91

    add-int/lit8 v10, v5, 0x3

    .line 1280
    aget v10, v1, v10

    if-eqz v10, :cond_8e

    add-int/lit8 v7, v7, 0x1

    shr-int/lit8 v11, v5, 0x2

    .line 1285
    aget-object v11, v2, v11

    if-eq v10, v8, :cond_87

    const/4 v12, 0x2

    if-eq v10, v12, :cond_79

    if-eq v10, v9, :cond_65

    .line 1303
    array-length v12, v3

    if-le v10, v12, :cond_5a

    .line 1304
    new-array v3, v10, [I

    :cond_5a
    add-int/lit8 v12, v5, 0x1

    .line 1307
    aget v12, v1, v12

    .line 1308
    invoke-static {v1, v12, v3, v0, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1309
    invoke-virtual {p0, v11, v3, v10}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->addName(Ljava/lang/String;[II)Ljava/lang/String;

    goto :goto_8e

    .line 1297
    :cond_65
    aget v10, v1, v5

    aput v10, v3, v0

    add-int/lit8 v10, v5, 0x1

    .line 1298
    aget v10, v1, v10

    aput v10, v3, v8

    add-int/lit8 v10, v5, 0x2

    .line 1299
    aget v10, v1, v10

    aput v10, v3, v12

    .line 1300
    invoke-virtual {p0, v11, v3, v9}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->addName(Ljava/lang/String;[II)Ljava/lang/String;

    goto :goto_8e

    .line 1292
    :cond_79
    aget v10, v1, v5

    aput v10, v3, v0

    add-int/lit8 v10, v5, 0x1

    .line 1293
    aget v10, v1, v10

    aput v10, v3, v8

    .line 1294
    invoke-virtual {p0, v11, v3, v12}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->addName(Ljava/lang/String;[II)Ljava/lang/String;

    goto :goto_8e

    .line 1288
    :cond_87
    aget v10, v1, v5

    aput v10, v3, v0

    .line 1289
    invoke-virtual {p0, v11, v3, v8}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->addName(Ljava/lang/String;[II)Ljava/lang/String;

    :cond_8e
    :goto_8e
    add-int/lit8 v5, v5, 0x4

    goto :goto_40

    :cond_91
    if-ne v7, v4, :cond_94

    return-void

    .line 1317
    :cond_94
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Internal error: Failed rehash(), old count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", copyCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected final _reportTooManyCollisions()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 1356
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    const/16 v1, 0x400

    if-gt v0, v1, :cond_7

    return-void

    .line 1359
    :cond_7
    new-instance v0, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Spill-over slots in symbol table with "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " entries, hash area of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " slots is now full (all "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    shr-int/lit8 p0, p0, 0x3

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final addName(Ljava/lang/String;[II)Ljava/lang/String;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 945
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_verifySharing()V

    .line 946
    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_intern:Z

    if-eqz v0, :cond_d

    .line 947
    sget-object v0, Lcom/fasterxml/jackson/core/util/InternCache;->instance:Lcom/fasterxml/jackson/core/util/InternCache;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/util/InternCache;->intern(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_d
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p3, v2, :cond_75

    if-eq p3, v0, :cond_58

    const/4 v3, 0x3

    if-eq p3, v3, :cond_32

    .line 977
    invoke-virtual {p0, p2, p3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->calcHash([II)I

    move-result v1

    .line 978
    invoke-direct {p0, v1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_findOffsetForAdd(I)I

    move-result v3

    .line 980
    iget-object v4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    aput v1, v4, v3

    .line 981
    invoke-direct {p0, p2, p3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_appendLongName([II)I

    move-result p2

    .line 982
    iget-object v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    add-int/lit8 v4, v3, 0x1

    aput p2, v1, v4

    add-int/lit8 p2, v3, 0x3

    .line 983
    aput p3, v1, p2

    goto :goto_89

    .line 969
    :cond_32
    aget p3, p2, v1

    aget v4, p2, v2

    aget v5, p2, v0

    invoke-virtual {p0, p3, v4, v5}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->calcHash(III)I

    move-result p3

    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_findOffsetForAdd(I)I

    move-result p3

    .line 970
    iget-object v4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    aget v1, p2, v1

    aput v1, v4, p3

    add-int/lit8 v1, p3, 0x1

    .line 971
    aget v5, p2, v2

    aput v5, v4, v1

    add-int/lit8 v1, p3, 0x2

    .line 972
    aget p2, p2, v0

    aput p2, v4, v1

    add-int/lit8 p2, p3, 0x3

    .line 973
    aput v3, v4, p2

    move v3, p3

    goto :goto_89

    .line 961
    :cond_58
    aget p3, p2, v1

    aget v3, p2, v2

    invoke-virtual {p0, p3, v3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->calcHash(II)I

    move-result p3

    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_findOffsetForAdd(I)I

    move-result v3

    .line 962
    iget-object p3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    aget v1, p2, v1

    aput v1, p3, v3

    add-int/lit8 v1, v3, 0x1

    .line 963
    aget p2, p2, v2

    aput p2, p3, v1

    add-int/lit8 p2, v3, 0x3

    .line 964
    aput v0, p3, p2

    goto :goto_89

    .line 954
    :cond_75
    aget p3, p2, v1

    invoke-virtual {p0, p3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->calcHash(I)I

    move-result p3

    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_findOffsetForAdd(I)I

    move-result v3

    .line 955
    iget-object p3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    aget p2, p2, v1

    aput p2, p3, v3

    add-int/lit8 p2, v3, 0x3

    .line 956
    aput v2, p3, p2

    .line 986
    :goto_89
    iget-object p2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p3, v3, 0x2

    aput-object p1, p2, p3

    .line 989
    iget p2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    add-int/2addr p2, v2

    iput p2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    return-object p1
.end method

.method public final calcHash(I)I
    .registers 2

    .line 1150
    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_seed:I

    xor-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0x10

    add-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x3

    xor-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0xc

    add-int/2addr p0, p1

    return p0
.end method

.method public final calcHash(II)I
    .registers 4

    ushr-int/lit8 v0, p1, 0xf

    add-int/2addr p1, v0

    .line 1171
    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_seed:I

    ushr-int/lit8 v0, p1, 0x9

    xor-int/2addr p1, v0

    mul-int/lit8 p2, p2, 0x21

    add-int/2addr p1, p2

    xor-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0x10

    add-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0x4

    xor-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x3

    add-int/2addr p0, p1

    return p0
.end method

.method public final calcHash(III)I
    .registers 4

    .line 1181
    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_seed:I

    xor-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0x9

    add-int/2addr p0, p1

    mul-int/lit8 p0, p0, 0x1f

    add-int/2addr p0, p2

    mul-int/lit8 p0, p0, 0x21

    ushr-int/lit8 p1, p0, 0xf

    add-int/2addr p0, p1

    xor-int/2addr p0, p3

    ushr-int/lit8 p1, p0, 0x4

    add-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0xf

    add-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x9

    xor-int/2addr p0, p1

    return p0
.end method

.method public final calcHash([II)I
    .registers 6

    const/4 v0, 0x4

    if-lt p2, v0, :cond_33

    const/4 v0, 0x0

    .line 1213
    aget v0, p1, v0

    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_seed:I

    xor-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x9

    add-int/2addr p0, v0

    const/4 v0, 0x1

    .line 1215
    aget v0, p1, v0

    add-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0xf

    add-int/2addr p0, v0

    mul-int/lit8 p0, p0, 0x21

    const/4 v0, 0x2

    .line 1218
    aget v0, p1, v0

    xor-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x4

    add-int/2addr p0, v0

    const/4 v0, 0x3

    :goto_1d
    if-ge v0, p2, :cond_28

    .line 1222
    aget v1, p1, v0

    shr-int/lit8 v2, v1, 0x15

    xor-int/2addr v1, v2

    add-int/2addr p0, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1d

    :cond_28
    const p1, 0x1003f

    mul-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0x13

    add-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x5

    xor-int/2addr p0, p1

    return p0

    .line 1206
    :cond_33
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "qlen is too short, needs to be at least 4"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final findName(I)Ljava/lang/String;
    .registers 8

    .line 571
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->calcHash(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_calcOffset(I)I

    move-result v0

    .line 573
    iget-object v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    add-int/lit8 v2, v0, 0x3

    .line 575
    aget v2, v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1d

    .line 578
    aget v2, v1, v0

    if-ne v2, p1, :cond_20

    .line 579
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v0, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_1d
    if-nez v2, :cond_20

    return-object v3

    .line 585
    :cond_20
    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    shr-int/lit8 v5, v0, 0x3

    shl-int/lit8 v5, v5, 0x2

    add-int/2addr v2, v5

    add-int/lit8 v5, v2, 0x3

    .line 587
    aget v5, v1, v5

    if-ne v5, v4, :cond_38

    .line 590
    aget v1, v1, v2

    if-ne v1, p1, :cond_3b

    .line 591
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v2, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_38
    if-nez v5, :cond_3b

    return-object v3

    .line 598
    :cond_3b
    invoke-direct {p0, v0, p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_findSecondary(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final findName(II)Ljava/lang/String;
    .registers 9

    .line 603
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->calcHash(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_calcOffset(I)I

    move-result v0

    .line 605
    iget-object v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    add-int/lit8 v2, v0, 0x3

    .line 607
    aget v2, v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-ne v2, v4, :cond_23

    .line 610
    aget v2, v1, v0

    if-ne p1, v2, :cond_26

    add-int/lit8 v2, v0, 0x1

    aget v2, v1, v2

    if-ne p2, v2, :cond_26

    .line 611
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v0, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_23
    if-nez v2, :cond_26

    return-object v3

    .line 617
    :cond_26
    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    shr-int/lit8 v5, v0, 0x3

    shl-int/2addr v5, v4

    add-int/2addr v2, v5

    add-int/lit8 v5, v2, 0x3

    .line 619
    aget v5, v1, v5

    if-ne v5, v4, :cond_43

    .line 622
    aget v3, v1, v2

    if-ne p1, v3, :cond_46

    add-int/lit8 v3, v2, 0x1

    aget v1, v1, v3

    if-ne p2, v1, :cond_46

    .line 623
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v2, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_43
    if-nez v5, :cond_46

    return-object v3

    .line 628
    :cond_46
    invoke-direct {p0, v0, p1, p2}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_findSecondary(III)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final findName(III)Ljava/lang/String;
    .registers 10

    .line 633
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->calcHash(III)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_calcOffset(I)I

    move-result v0

    .line 634
    iget-object v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    add-int/lit8 v2, v0, 0x3

    .line 635
    aget v2, v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-ne v2, v4, :cond_29

    .line 638
    aget v2, v1, v0

    if-ne p1, v2, :cond_2c

    add-int/lit8 v2, v0, 0x1

    aget v2, v1, v2

    if-ne v2, p2, :cond_2c

    add-int/lit8 v2, v0, 0x2

    aget v2, v1, v2

    if-ne v2, p3, :cond_2c

    .line 639
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v0, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_29
    if-nez v2, :cond_2c

    return-object v3

    .line 645
    :cond_2c
    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    shr-int/lit8 v5, v0, 0x3

    shl-int/lit8 v5, v5, 0x2

    add-int/2addr v2, v5

    add-int/lit8 v5, v2, 0x3

    .line 647
    aget v5, v1, v5

    if-ne v5, v4, :cond_50

    .line 650
    aget v3, v1, v2

    if-ne p1, v3, :cond_53

    add-int/lit8 v3, v2, 0x1

    aget v3, v1, v3

    if-ne v3, p2, :cond_53

    add-int/lit8 v3, v2, 0x2

    aget v1, v1, v3

    if-ne v1, p3, :cond_53

    .line 651
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v2, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_50
    if-nez v5, :cond_53

    return-object v3

    .line 656
    :cond_53
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_findSecondary(IIII)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final findName([II)Ljava/lang/String;
    .registers 10

    const/4 v0, 0x4

    const/4 v1, 0x2

    if-ge p2, v0, :cond_2b

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-eq p2, v2, :cond_24

    if-eq p2, v1, :cond_1b

    const/4 v3, 0x3

    if-eq p2, v3, :cond_10

    .line 674
    const-string p0, ""

    return-object p0

    .line 668
    :cond_10
    aget p2, p1, v0

    aget v0, p1, v2

    aget p1, p1, v1

    invoke-virtual {p0, p2, v0, p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->findName(III)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 670
    :cond_1b
    aget p2, p1, v0

    aget p1, p1, v2

    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->findName(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 672
    :cond_24
    aget p1, p1, v0

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->findName(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 677
    :cond_2b
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->calcHash([II)I

    move-result v0

    .line 678
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_calcOffset(I)I

    move-result v2

    .line 680
    iget-object v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    add-int/lit8 v4, v2, 0x3

    .line 682
    aget v4, v3, v4

    .line 684
    aget v5, v3, v2

    if-ne v0, v5, :cond_50

    if-ne v4, p2, :cond_50

    add-int/lit8 v5, v2, 0x1

    .line 686
    aget v5, v3, v5

    invoke-direct {p0, p1, p2, v5}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_verifyLongName([III)Z

    move-result v5

    if-eqz v5, :cond_50

    .line 687
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v2, 0x2

    aget-object p0, p0, p1

    return-object p0

    :cond_50
    if-nez v4, :cond_54

    const/4 p0, 0x0

    return-object p0

    .line 694
    :cond_54
    iget v4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    shr-int/lit8 v5, v2, 0x3

    shl-int/2addr v5, v1

    add-int/2addr v4, v5

    add-int/lit8 v5, v4, 0x3

    .line 696
    aget v5, v3, v5

    .line 697
    aget v6, v3, v4

    if-ne v0, v6, :cond_75

    if-ne v5, p2, :cond_75

    add-int/lit8 v5, v4, 0x1

    .line 698
    aget v3, v3, v5

    invoke-direct {p0, p1, p2, v3}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_verifyLongName([III)Z

    move-result v3

    if-eqz v3, :cond_75

    .line 699
    iget-object p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    shr-int/lit8 p1, v4, 0x2

    aget-object p0, p0, p1

    return-object p0

    .line 702
    :cond_75
    invoke-direct {p0, v2, v0, p1, p2}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_findSecondary(II[II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final makeChild(I)Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;
    .registers 9

    .line 363
    iget v2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_seed:I

    iget-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tableInfo:Ljava/util/concurrent/atomic/AtomicReference;

    .line 364
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;

    sget-object v0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->INTERN_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 365
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->enabledIn(I)Z

    move-result v4

    sget-object v0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->FAIL_ON_SYMBOL_HASH_OVERFLOW:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 366
    new-instance v6, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->enabledIn(I)Z

    move-result v5

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;-><init>(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;ILcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;ZZ)V

    return-object v6
.end method

.method public final maybeDirty()Z
    .registers 1

    .line 462
    iget-boolean p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashShared:Z

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public final primaryCount()I
    .registers 5

    .line 487
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    const/4 v1, 0x0

    const/4 v2, 0x3

    :goto_4
    if-ge v2, v0, :cond_11

    .line 488
    iget-object v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    aget v3, v3, v2

    if-eqz v3, :cond_e

    add-int/lit8 v1, v1, 0x1

    :cond_e
    add-int/lit8 v2, v2, 0x4

    goto :goto_4

    :cond_11
    return v1
.end method

.method public final release()V
    .registers 3

    .line 402
    iget-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_parent:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    if-eqz v0, :cond_17

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->maybeDirty()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 403
    iget-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_parent:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    new-instance v1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;

    invoke-direct {v1, p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;-><init>(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)V

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->mergeChild(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;)V

    const/4 v0, 0x1

    .line 406
    iput-boolean v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashShared:Z

    :cond_17
    return-void
.end method

.method public final secondaryCount()I
    .registers 5

    .line 503
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_secondaryStart:I

    add-int/lit8 v0, v0, 0x3

    .line 504
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    const/4 v2, 0x0

    :goto_7
    if-ge v0, v1, :cond_14

    .line 505
    iget-object v3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    aget v3, v3, v0

    if-eqz v3, :cond_11

    add-int/lit8 v2, v2, 0x1

    :cond_11
    add-int/lit8 v0, v0, 0x4

    goto :goto_7

    :cond_14
    return v2
.end method

.method public final spilloverCount()I
    .registers 2

    .line 537
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    invoke-direct {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverStart()I

    move-result p0

    sub-int/2addr v0, p0

    shr-int/lit8 p0, v0, 0x2

    return p0
.end method

.method public final tertiaryCount()I
    .registers 6

    .line 520
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryStart:I

    add-int/lit8 v0, v0, 0x3

    .line 521
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    const/4 v2, 0x0

    move v3, v0

    :goto_8
    add-int v4, v1, v0

    if-ge v3, v4, :cond_17

    .line 522
    iget-object v4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    aget v4, v4, v3

    if-eqz v4, :cond_14

    add-int/lit8 v2, v2, 0x1

    :cond_14
    add-int/lit8 v3, v3, 0x4

    goto :goto_8

    :cond_17
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .registers 16

    .line 553
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->primaryCount()I

    move-result v0

    .line 554
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->secondaryCount()I

    move-result v1

    .line 555
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->tertiaryCount()I

    move-result v2

    .line 556
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->spilloverCount()I

    move-result v3

    .line 557
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->totalCount()I

    move-result v4

    .line 559
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    iget v5, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    iget p0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    .line 560
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    add-int/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array/range {v6 .. v14}, [Ljava/lang/Object;

    move-result-object p0

    .line 558
    const-string v0, "[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final totalCount()I
    .registers 6

    .line 543
    iget v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    move v3, v1

    :goto_5
    shl-int/lit8 v4, v0, 0x3

    if-ge v3, v4, :cond_14

    .line 544
    iget-object v4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    aget v4, v4, v3

    if-eqz v4, :cond_11

    add-int/lit8 v2, v2, 0x1

    :cond_11
    add-int/lit8 v3, v3, 0x4

    goto :goto_5

    :cond_14
    return v2
.end method

###### Class com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.TableInfo (com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo)
.class final Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "TableInfo"
.end annotation


# instance fields
.field public final count:I

.field public final longNameOffset:I

.field public final mainHash:[I

.field public final names:[Ljava/lang/String;

.field public final size:I

.field public final spilloverEnd:I

.field public final tertiaryShift:I


# direct methods
.method public constructor <init>(III[I[Ljava/lang/String;II)V
    .registers 8

    .line 1409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1410
    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->size:I

    .line 1411
    iput p2, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->count:I

    .line 1412
    iput p3, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->tertiaryShift:I

    .line 1413
    iput-object p4, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->mainHash:[I

    .line 1414
    iput-object p5, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->names:[Ljava/lang/String;

    .line 1415
    iput p6, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->spilloverEnd:I

    .line 1416
    iput p7, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->longNameOffset:I

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;)V
    .registers 3

    .line 1420
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1421
    iget v0, p1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashSize:I

    iput v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->size:I

    .line 1422
    iget v0, p1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_count:I

    iput v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->count:I

    .line 1423
    iget v0, p1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_tertiaryShift:I

    iput v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->tertiaryShift:I

    .line 1424
    iget-object v0, p1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_hashArea:[I

    iput-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->mainHash:[I

    .line 1425
    iget-object v0, p1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_names:[Ljava/lang/String;

    iput-object v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->names:[Ljava/lang/String;

    .line 1426
    iget v0, p1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_spilloverEnd:I

    iput v0, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->spilloverEnd:I

    .line 1427
    iget p1, p1, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_longNameOffset:I

    iput p1, p0, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;->longNameOffset:I

    return-void
.end method

.method public static createInitial(I)Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;
    .registers 10

    shl-int/lit8 v7, p0, 0x3

    .line 1432
    invoke-static {p0}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->_calcTertiaryShift(I)I

    move-result v3

    .line 1434
    new-instance v8, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;

    const/4 v2, 0x0

    new-array v4, v7, [I

    shl-int/lit8 v0, p0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    sub-int v6, v7, p0

    move-object v0, v8

    move v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer$TableInfo;-><init>(III[I[Ljava/lang/String;II)V

    return-object v8
.end method
