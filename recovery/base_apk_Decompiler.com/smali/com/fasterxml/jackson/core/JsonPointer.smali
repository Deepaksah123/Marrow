###### Class com.fasterxml.jackson.core.JsonPointer (com.fasterxml.jackson.core.JsonPointer)
.class public Lcom/fasterxml/jackson/core/JsonPointer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;,
        Lcom/fasterxml/jackson/core/JsonPointer$Serialization;
    }
.end annotation


# static fields
.field protected static final EMPTY:Lcom/fasterxml/jackson/core/JsonPointer;


# instance fields
.field protected final _asString:Ljava/lang/String;

.field protected final _asStringOffset:I

.field protected _hashCode:I

.field protected final _matchingElementIndex:I

.field protected final _matchingPropertyName:Ljava/lang/String;

.field protected final _nextSegment:Lcom/fasterxml/jackson/core/JsonPointer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 42
    new-instance v0, Lcom/fasterxml/jackson/core/JsonPointer;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/JsonPointer;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/core/JsonPointer;->EMPTY:Lcom/fasterxml/jackson/core/JsonPointer;

    return-void
.end method

.method protected constructor <init>()V
    .registers 2

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 105
    iput-object v0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_nextSegment:Lcom/fasterxml/jackson/core/JsonPointer;

    .line 107
    iput-object v0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_matchingPropertyName:Ljava/lang/String;

    const/4 v0, -0x1

    .line 108
    iput v0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_matchingElementIndex:I

    .line 109
    const-string v0, ""

    iput-object v0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_asString:Ljava/lang/String;

    const/4 v0, 0x0

    .line 110
    iput v0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_asStringOffset:I

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/fasterxml/jackson/core/JsonPointer;)V
    .registers 5

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p1, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_asString:Ljava/lang/String;

    .line 118
    iput p2, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_asStringOffset:I

    .line 119
    iput-object p4, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_nextSegment:Lcom/fasterxml/jackson/core/JsonPointer;

    .line 121
    iput-object p3, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_matchingPropertyName:Ljava/lang/String;

    .line 123
    invoke-static {p3}, Lcom/fasterxml/jackson/core/JsonPointer;->_parseIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_matchingElementIndex:I

    return-void
.end method

.method private static _appendEscape(Ljava/lang/StringBuilder;C)V
    .registers 4

    const/16 v0, 0x30

    const/16 v1, 0x7e

    if-ne p1, v0, :cond_8

    move p1, v1

    goto :goto_12

    :cond_8
    const/16 v0, 0x31

    if-ne p1, v0, :cond_f

    const/16 p1, 0x2f

    goto :goto_12

    .line 740
    :cond_f
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 742
    :goto_12
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static _buildPath(Ljava/lang/String;ILjava/lang/String;Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;)Lcom/fasterxml/jackson/core/JsonPointer;
    .registers 6

    .line 687
    new-instance v0, Lcom/fasterxml/jackson/core/JsonPointer;

    sget-object v1, Lcom/fasterxml/jackson/core/JsonPointer;->EMPTY:Lcom/fasterxml/jackson/core/JsonPointer;

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/fasterxml/jackson/core/JsonPointer;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/fasterxml/jackson/core/JsonPointer;)V

    :goto_7
    if-eqz p3, :cond_16

    .line 689
    new-instance p1, Lcom/fasterxml/jackson/core/JsonPointer;

    iget p2, p3, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;->fullPathOffset:I

    iget-object v1, p3, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;->segment:Ljava/lang/String;

    invoke-direct {p1, p0, p2, v1, v0}, Lcom/fasterxml/jackson/core/JsonPointer;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/fasterxml/jackson/core/JsonPointer;)V

    .line 688
    iget-object p3, p3, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;->parent:Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;

    move-object v0, p1

    goto :goto_7

    :cond_16
    return-object v0
.end method

.method private final _compare(Ljava/lang/String;ILjava/lang/String;I)Z
    .registers 8

    .line 593
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    sub-int v0, p0, p2

    .line 596
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, p4

    const/4 v2, 0x0

    if-eq v0, v1, :cond_f

    return v2

    :cond_f
    :goto_f
    if-ge p2, p0, :cond_21

    .line 601
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p3, p4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v0, v1, :cond_1c

    return v2

    :cond_1c
    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p4, p4, 0x1

    goto :goto_f

    :cond_21
    const/4 p0, 0x1

    return p0
.end method

.method protected static _extractEscapedSegment(Ljava/lang/String;IILjava/lang/StringBuilder;)I
    .registers 7

    .line 712
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, p2, -0x1

    sub-int v2, v1, p1

    if-lez v2, :cond_d

    .line 715
    invoke-virtual {p3, p0, p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_d
    add-int/lit8 p1, p2, 0x1

    .line 717
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    invoke-static {p3, p2}, Lcom/fasterxml/jackson/core/JsonPointer;->_appendEscape(Ljava/lang/StringBuilder;C)V

    :goto_16
    if-ge p1, v0, :cond_38

    .line 719
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v1, 0x2f

    if-ne p2, v1, :cond_21

    return p1

    :cond_21
    add-int/lit8 v1, p1, 0x1

    const/16 v2, 0x7e

    if-ne p2, v2, :cond_33

    if-ge v1, v0, :cond_33

    add-int/lit8 p1, p1, 0x2

    .line 725
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p2

    invoke-static {p3, p2}, Lcom/fasterxml/jackson/core/JsonPointer;->_appendEscape(Ljava/lang/StringBuilder;C)V

    goto :goto_16

    .line 728
    :cond_33
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move p1, v1

    goto :goto_16

    :cond_38
    const/4 p0, -0x1

    return p0
.end method

.method private static final _parseIndex(Ljava/lang/String;)I
    .registers 8

    .line 616
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_41

    const/16 v2, 0xa

    if-gt v0, v2, :cond_41

    const/4 v3, 0x0

    .line 623
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    const/4 v6, 0x1

    if-gt v4, v5, :cond_1b

    if-ne v0, v6, :cond_1a

    if-ne v4, v5, :cond_1a

    return v3

    :cond_1a
    return v1

    :cond_1b
    const/16 v3, 0x39

    if-le v4, v3, :cond_20

    return v1

    :cond_20
    :goto_20
    if-ge v6, v0, :cond_2e

    .line 631
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-gt v4, v3, :cond_2d

    if-lt v4, v5, :cond_2d

    add-int/lit8 v6, v6, 0x1

    goto :goto_20

    :cond_2d
    return v1

    :cond_2e
    if-ne v0, v2, :cond_3c

    .line 637
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/32 v4, 0x7fffffff

    cmp-long v0, v2, v4

    if-lez v0, :cond_3c

    return v1

    .line 642
    :cond_3c
    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/NumberInput;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_41
    return v1
.end method

.method protected static _parseTail(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonPointer;
    .registers 7

    .line 651
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :cond_7
    :goto_7
    if-ge v2, v0, :cond_4d

    .line 655
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2f

    if-ne v4, v5, :cond_22

    .line 658
    new-instance v4, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v1, v3, v5}, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;-><init>(Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;ILjava/lang/String;)V

    add-int/lit8 v1, v2, 0x1

    move v3, v2

    move v2, v1

    move-object v1, v4

    goto :goto_7

    :cond_22
    add-int/lit8 v2, v2, 0x1

    const/16 v5, 0x7e

    if-ne v4, v5, :cond_7

    if-ge v2, v0, :cond_7

    .line 668
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    add-int/lit8 v5, v3, 0x1

    .line 669
    invoke-static {p0, v5, v2, v4}, Lcom/fasterxml/jackson/core/JsonPointer;->_extractEscapedSegment(Ljava/lang/String;IILjava/lang/StringBuilder;)I

    move-result v2

    .line 670
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    if-gez v2, :cond_42

    .line 672
    invoke-static {p0, v3, v4, v1}, Lcom/fasterxml/jackson/core/JsonPointer;->_buildPath(Ljava/lang/String;ILjava/lang/String;Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;)Lcom/fasterxml/jackson/core/JsonPointer;

    move-result-object p0

    return-object p0

    .line 674
    :cond_42
    new-instance v5, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;

    invoke-direct {v5, v1, v3, v4}, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;-><init>(Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;ILjava/lang/String;)V

    add-int/lit8 v1, v2, 0x1

    move v3, v2

    move v2, v1

    move-object v1, v5

    goto :goto_7

    :cond_4d
    add-int/lit8 v0, v3, 0x1

    .line 682
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v3, v0, v1}, Lcom/fasterxml/jackson/core/JsonPointer;->_buildPath(Ljava/lang/String;ILjava/lang/String;Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;)Lcom/fasterxml/jackson/core/JsonPointer;

    move-result-object p0

    return-object p0
.end method

.method public static compile(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonPointer;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    if-eqz p0, :cond_2f

    .line 157
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2f

    const/4 v0, 0x0

    .line 161
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_16

    .line 164
    invoke-static {p0}, Lcom/fasterxml/jackson/core/JsonPointer;->_parseTail(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonPointer;

    move-result-object p0

    return-object p0

    .line 162
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid input: JSON Pointer expression must start with \'/\': \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :cond_2f
    sget-object p0, Lcom/fasterxml/jackson/core/JsonPointer;->EMPTY:Lcom/fasterxml/jackson/core/JsonPointer;

    return-object p0
.end method

.method private writeReplace()Ljava/lang/Object;
    .registers 2

    .line 832
    new-instance v0, Lcom/fasterxml/jackson/core/JsonPointer$Serialization;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/core/JsonPointer$Serialization;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 5

    if-ne p1, p0, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_4
    const/4 v0, 0x0

    if-nez p1, :cond_8

    return v0

    .line 582
    :cond_8
    instance-of v1, p1, Lcom/fasterxml/jackson/core/JsonPointer;

    if-nez v1, :cond_d

    return v0

    .line 583
    :cond_d
    check-cast p1, Lcom/fasterxml/jackson/core/JsonPointer;

    .line 587
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_asString:Ljava/lang/String;

    iget v1, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_asStringOffset:I

    iget-object v2, p1, Lcom/fasterxml/jackson/core/JsonPointer;->_asString:Ljava/lang/String;

    iget p1, p1, Lcom/fasterxml/jackson/core/JsonPointer;->_asStringOffset:I

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/fasterxml/jackson/core/JsonPointer;->_compare(Ljava/lang/String;ILjava/lang/String;I)Z

    move-result p0

    return p0
.end method

.method public getMatchingIndex()I
    .registers 1

    .line 317
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_matchingElementIndex:I

    return p0
.end method

.method public getMatchingProperty()Ljava/lang/String;
    .registers 1

    .line 316
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_matchingPropertyName:Ljava/lang/String;

    return-object p0
.end method

.method public hashCode()I
    .registers 2

    .line 565
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_hashCode:I

    if-nez v0, :cond_11

    .line 570
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    if-nez v0, :cond_f

    const/4 v0, -0x1

    .line 574
    :cond_f
    iput v0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_hashCode:I

    :cond_11
    return v0
.end method

.method public matches()Z
    .registers 1

    .line 315
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_nextSegment:Lcom/fasterxml/jackson/core/JsonPointer;

    if-nez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public mayMatchElement()Z
    .registers 1

    .line 329
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_matchingElementIndex:I

    if-ltz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public tail()Lcom/fasterxml/jackson/core/JsonPointer;
    .registers 1

    .line 521
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_nextSegment:Lcom/fasterxml/jackson/core/JsonPointer;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    .line 558
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_asStringOffset:I

    if-gtz v0, :cond_7

    .line 559
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_asString:Ljava/lang/String;

    return-object p0

    .line 561
    :cond_7
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonPointer;->_asString:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class com.fasterxml.jackson.core.JsonPointer.PointerParent (com.fasterxml.jackson.core.JsonPointer$PointerParent)
.class Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/JsonPointer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "PointerParent"
.end annotation


# instance fields
.field public final fullPathOffset:I

.field public final parent:Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;

.field public final segment:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;ILjava/lang/String;)V
    .registers 4

    .line 790
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 791
    iput-object p1, p0, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;->parent:Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;

    .line 792
    iput p2, p0, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;->fullPathOffset:I

    .line 793
    iput-object p3, p0, Lcom/fasterxml/jackson/core/JsonPointer$PointerParent;->segment:Ljava/lang/String;

    return-void
.end method

###### Class com.fasterxml.jackson.core.JsonPointer.Serialization (com.fasterxml.jackson.core.JsonPointer$Serialization)
.class Lcom/fasterxml/jackson/core/JsonPointer$Serialization;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Externalizable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/JsonPointer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Serialization"
.end annotation


# instance fields
.field private _fullPath:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 847
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .registers 2

    .line 849
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 850
    iput-object p1, p0, Lcom/fasterxml/jackson/core/JsonPointer$Serialization;->_fullPath:Ljava/lang/String;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 866
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonPointer$Serialization;->_fullPath:Ljava/lang/String;

    invoke-static {p0}, Lcom/fasterxml/jackson/core/JsonPointer;->compile(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonPointer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public readExternal(Ljava/io/ObjectInput;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 860
    invoke-interface {p1}, Ljava/io/ObjectInput;->readUTF()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/JsonPointer$Serialization;->_fullPath:Ljava/lang/String;

    return-void
.end method

.method public writeExternal(Ljava/io/ObjectOutput;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 855
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonPointer$Serialization;->_fullPath:Ljava/lang/String;

    invoke-interface {p1, p0}, Ljava/io/ObjectOutput;->writeUTF(Ljava/lang/String;)V

    return-void
.end method
