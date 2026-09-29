###### Class com.fasterxml.jackson.core.Base64Variant (com.fasterxml.jackson.core.Base64Variant)
.class public final Lcom/fasterxml/jackson/core/Base64Variant;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;
    }
.end annotation


# instance fields
.field private final transient _asciiToBase64:[I

.field private final transient _base64ToAsciiB:[B

.field private final transient _base64ToAsciiC:[C

.field private final _maxLineLength:I

.field final _name:Ljava/lang/String;

.field private final _paddingChar:C

.field private final _paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

.field private final _writePadding:Z


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/lang/String;I)V
    .registers 10

    .line 196
    iget-boolean v3, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_writePadding:Z

    iget-char v4, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/core/Base64Variant;-><init>(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/lang/String;ZCI)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/lang/String;ZCI)V
    .registers 13

    .line 214
    iget-object v5, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/core/Base64Variant;-><init>(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/lang/String;ZCLcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;I)V

    return-void
.end method

.method private constructor <init>(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/lang/String;ZCLcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;I)V
    .registers 12

    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    .line 82
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_asciiToBase64:[I

    const/16 v1, 0x40

    .line 88
    new-array v2, v1, [C

    iput-object v2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    .line 94
    new-array v1, v1, [B

    iput-object v1, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiB:[B

    .line 220
    iput-object p2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_name:Ljava/lang/String;

    .line 221
    iget-object p2, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiB:[B

    .line 222
    array-length v3, p2

    const/4 v4, 0x0

    invoke-static {p2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 223
    iget-object p2, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    .line 224
    array-length v1, p2

    invoke-static {p2, v4, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 225
    iget-object p1, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_asciiToBase64:[I

    .line 226
    array-length p2, p1

    invoke-static {p1, v4, v0, v4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 228
    iput-boolean p3, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_writePadding:Z

    .line 229
    iput-char p4, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    .line 230
    iput p6, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_maxLineLength:I

    .line 231
    iput-object p5, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZCI)V
    .registers 10

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    .line 82
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_asciiToBase64:[I

    const/16 v1, 0x40

    .line 88
    new-array v2, v1, [C

    iput-object v2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    .line 94
    new-array v3, v1, [B

    iput-object v3, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiB:[B

    .line 149
    iput-object p1, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_name:Ljava/lang/String;

    .line 150
    iput-boolean p3, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_writePadding:Z

    .line 151
    iput-char p4, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    .line 152
    iput p5, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_maxLineLength:I

    .line 157
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-ne p1, v1, :cond_4c

    const/4 p5, 0x0

    .line 163
    invoke-virtual {p2, p5, p1, v2, p5}, Ljava/lang/String;->getChars(II[CI)V

    const/4 p2, -0x1

    .line 164
    invoke-static {v0, p2}, Ljava/util/Arrays;->fill([II)V

    :goto_29
    if-ge p5, p1, :cond_3b

    .line 166
    iget-object p2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    aget-char p2, p2, p5

    .line 167
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiB:[B

    int-to-byte v1, p2

    aput-byte v1, v0, p5

    .line 168
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_asciiToBase64:[I

    aput p5, v0, p2

    add-int/lit8 p5, p5, 0x1

    goto :goto_29

    :cond_3b
    if-eqz p3, :cond_42

    .line 173
    iget-object p1, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_asciiToBase64:[I

    const/4 p2, -0x2

    aput p2, p1, p4

    :cond_42
    if-eqz p3, :cond_47

    .line 178
    sget-object p1, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->PADDING_REQUIRED:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    goto :goto_49

    :cond_47
    sget-object p1, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->PADDING_FORBIDDEN:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    :goto_49
    iput-object p1, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    return-void

    .line 159
    :cond_4c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Base64Alphabet length must be exactly 64 (was "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected final _reportBase64EOF()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 854
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->missingPaddingMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final _reportBase64UnexpectedPadding()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 858
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->unexpectedPaddingMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final _reportInvalidBase64(CILjava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    const/16 v0, 0x20

    if-gt p1, v0, :cond_26

    .line 838
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Illegal white space character (code 0x"

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") as character #"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of 4-char base64 unit: can only used between units"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_8f

    .line 839
    :cond_26
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPaddingChar(C)Z

    move-result v0

    if-eqz v0, :cond_4e

    .line 840
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected padding character (\'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->getPaddingChar()C

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "\') as character #"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " of 4-char base64 unit: padding only legal as 3rd or 4th character"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_8f

    .line 841
    :cond_4e
    invoke-static {p1}, Ljava/lang/Character;->isDefined(C)Z

    move-result p0

    const-string p2, ") in base64 content"

    if-eqz p0, :cond_7a

    invoke-static {p1}, Ljava/lang/Character;->isISOControl(C)Z

    move-result p0

    if-nez p0, :cond_7a

    .line 845
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Illegal character \'"

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "\' (code 0x"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_8f

    .line 843
    :cond_7a
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Illegal character (code 0x"

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_8f
    if-eqz p3, :cond_a5

    .line 848
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 850
    :cond_a5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final acceptsPaddingOnRead()Z
    .registers 2

    .line 341
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    sget-object v0, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->PADDING_FORBIDDEN:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    if-eq p0, v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final decode(Ljava/lang/String;Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;)V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 699
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-lt v2, v0, :cond_9

    return-void

    :cond_9
    add-int/lit8 v3, v2, 0x1

    .line 709
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x20

    if-le v4, v5, :cond_d2

    .line 711
    invoke-virtual {p0, v4}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    move-result v5

    const/4 v6, 0x0

    if-gez v5, :cond_1d

    .line 713
    invoke-virtual {p0, v4, v1, v6}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportInvalidBase64(CILjava/lang/String;)V

    :cond_1d
    if-lt v3, v0, :cond_22

    .line 718
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportBase64EOF()V

    :cond_22
    add-int/lit8 v4, v2, 0x2

    .line 720
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 721
    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    move-result v7

    if-gez v7, :cond_32

    const/4 v8, 0x1

    .line 723
    invoke-virtual {p0, v3, v8, v6}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportInvalidBase64(CILjava/lang/String;)V

    :cond_32
    shl-int/lit8 v3, v5, 0x6

    or-int/2addr v3, v7

    if-lt v4, v0, :cond_46

    .line 729
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->requiresPaddingOnRead()Z

    move-result v5

    if-nez v5, :cond_43

    shr-int/lit8 p0, v3, 0x4

    .line 731
    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    return-void

    .line 734
    :cond_43
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportBase64EOF()V

    :cond_46
    add-int/lit8 v5, v2, 0x3

    .line 736
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 737
    invoke-virtual {p0, v4}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    move-result v7

    const/4 v8, -0x2

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-gez v7, :cond_95

    if-eq v7, v8, :cond_5a

    .line 742
    invoke-virtual {p0, v4, v10, v6}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportInvalidBase64(CILjava/lang/String;)V

    .line 744
    :cond_5a
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->acceptsPaddingOnRead()Z

    move-result v4

    if-nez v4, :cond_63

    .line 745
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportBase64UnexpectedPadding()V

    :cond_63
    if-lt v5, v0, :cond_68

    .line 749
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportBase64EOF()V

    :cond_68
    add-int/lit8 v2, v2, 0x4

    .line 751
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 752
    invoke-virtual {p0, v4}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPaddingChar(C)Z

    move-result v5

    if-nez v5, :cond_8e

    .line 753
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "expected padding character \'"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->getPaddingChar()C

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v6, "\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v4, v9, v5}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportInvalidBase64(CILjava/lang/String;)V

    :cond_8e
    shr-int/lit8 v3, v3, 0x4

    .line 757
    invoke-virtual {p2, v3}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->append(I)V

    goto/16 :goto_6

    :cond_95
    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v3, v7

    if-lt v5, v0, :cond_a9

    .line 765
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->requiresPaddingOnRead()Z

    move-result v4

    if-nez v4, :cond_a6

    shr-int/lit8 p0, v3, 0x2

    .line 767
    invoke-virtual {p2, p0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->appendTwoBytes(I)V

    return-void

    .line 770
    :cond_a6
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportBase64EOF()V

    :cond_a9
    add-int/lit8 v2, v2, 0x4

    .line 772
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 773
    invoke-virtual {p0, v4}, Lcom/fasterxml/jackson/core/Base64Variant;->decodeBase64Char(C)I

    move-result v5

    if-gez v5, :cond_ca

    if-eq v5, v8, :cond_ba

    .line 776
    invoke-virtual {p0, v4, v9, v6}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportInvalidBase64(CILjava/lang/String;)V

    .line 778
    :cond_ba
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->acceptsPaddingOnRead()Z

    move-result v4

    if-nez v4, :cond_c3

    .line 779
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->_reportBase64UnexpectedPadding()V

    :cond_c3
    shr-int/lit8 v3, v3, 0x2

    .line 782
    invoke-virtual {p2, v3}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->appendTwoBytes(I)V

    goto/16 :goto_6

    :cond_ca
    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v3, v5

    .line 786
    invoke-virtual {p2, v3}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->appendThreeBytes(I)V

    goto/16 :goto_6

    :cond_d2
    move v2, v3

    goto/16 :goto_6
.end method

.method public final decode(Ljava/lang/String;)[B
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 675
    new-instance v0, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;-><init>()V

    .line 676
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/Base64Variant;->decode(Ljava/lang/String;Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;)V

    .line 677
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method public final decodeBase64Char(C)I
    .registers 3

    const/16 v0, 0x7f

    if-gt p1, v0, :cond_9

    .line 374
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_asciiToBase64:[I

    aget p0, p0, p1

    return p0

    :cond_9
    const/4 p0, -0x1

    return p0
.end method

.method public final decodeBase64Char(I)I
    .registers 3

    const/16 v0, 0x7f

    if-gt p1, v0, :cond_9

    .line 379
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_asciiToBase64:[I

    aget p0, p0, p1

    return p0

    :cond_9
    const/4 p0, -0x1

    return p0
.end method

.method public final encode([B)Ljava/lang/String;
    .registers 3

    const/4 v0, 0x0

    .line 550
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/Base64Variant;->encode([BZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final encode([BZ)Ljava/lang/String;
    .registers 12

    .line 567
    array-length v0, p1

    .line 568
    new-instance v1, Ljava/lang/StringBuilder;

    shr-int/lit8 v2, v0, 0x2

    add-int/2addr v2, v0

    shr-int/lit8 v3, v0, 0x3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x22

    if-eqz p2, :cond_13

    .line 570
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 573
    :cond_13
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->getMaxLineLength()I

    move-result v3

    const/4 v4, 0x2

    shr-int/2addr v3, v4

    const/4 v5, 0x0

    :goto_1a
    add-int/lit8 v6, v0, -0x3

    if-gt v5, v6, :cond_4c

    .line 581
    aget-byte v6, p1, v5

    add-int/lit8 v7, v5, 0x1

    .line 582
    aget-byte v7, p1, v7

    add-int/lit8 v8, v5, 0x3

    add-int/lit8 v5, v5, 0x2

    .line 583
    aget-byte v5, p1, v5

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v6, v6, 0x8

    or-int/2addr v6, v7

    shl-int/lit8 v6, v6, 0x8

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v5, v6

    .line 584
    invoke-virtual {p0, v1, v5}, Lcom/fasterxml/jackson/core/Base64Variant;->encodeBase64Chunk(Ljava/lang/StringBuilder;I)V

    add-int/lit8 v3, v3, -0x1

    if-gtz v3, :cond_4a

    const/16 v3, 0x5c

    .line 587
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v3, 0x6e

    .line 588
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 589
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->getMaxLineLength()I

    move-result v3

    shr-int/2addr v3, v4

    :cond_4a
    move v5, v8

    goto :goto_1a

    :cond_4c
    sub-int/2addr v0, v5

    if-lez v0, :cond_61

    .line 596
    aget-byte v3, p1, v5

    shl-int/lit8 v3, v3, 0x10

    if-ne v0, v4, :cond_5e

    add-int/lit8 v5, v5, 0x1

    .line 598
    aget-byte p1, p1, v5

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr v3, p1

    .line 600
    :cond_5e
    invoke-virtual {p0, v1, v3, v0}, Lcom/fasterxml/jackson/core/Base64Variant;->encodeBase64Partial(Ljava/lang/StringBuilder;II)V

    :cond_61
    if-eqz p2, :cond_66

    .line 604
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 606
    :cond_66
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final encodeBase64Chunk(I[BI)I
    .registers 6

    .line 496
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiB:[B

    shr-int/lit8 v0, p1, 0x12

    and-int/lit8 v0, v0, 0x3f

    aget-byte v0, p0, v0

    aput-byte v0, p2, p3

    add-int/lit8 v0, p3, 0x1

    shr-int/lit8 v1, p1, 0xc

    and-int/lit8 v1, v1, 0x3f

    .line 497
    aget-byte v1, p0, v1

    aput-byte v1, p2, v0

    add-int/lit8 v0, p3, 0x2

    shr-int/lit8 v1, p1, 0x6

    and-int/lit8 v1, v1, 0x3f

    .line 498
    aget-byte v1, p0, v1

    aput-byte v1, p2, v0

    add-int/lit8 v0, p3, 0x3

    and-int/lit8 p1, p1, 0x3f

    .line 499
    aget-byte p0, p0, p1

    aput-byte p0, p2, v0

    add-int/lit8 p3, p3, 0x4

    return p3
.end method

.method public final encodeBase64Chunk(I[CI)I
    .registers 6

    .line 419
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 v0, p1, 0x12

    and-int/lit8 v0, v0, 0x3f

    aget-char v0, p0, v0

    aput-char v0, p2, p3

    add-int/lit8 v0, p3, 0x1

    shr-int/lit8 v1, p1, 0xc

    and-int/lit8 v1, v1, 0x3f

    .line 420
    aget-char v1, p0, v1

    aput-char v1, p2, v0

    add-int/lit8 v0, p3, 0x2

    shr-int/lit8 v1, p1, 0x6

    and-int/lit8 v1, v1, 0x3f

    .line 421
    aget-char v1, p0, v1

    aput-char v1, p2, v0

    add-int/lit8 v0, p3, 0x3

    and-int/lit8 p1, p1, 0x3f

    .line 422
    aget-char p0, p0, p1

    aput-char p0, p2, v0

    add-int/lit8 p3, p3, 0x4

    return p3
.end method

.method public final encodeBase64Chunk(Ljava/lang/StringBuilder;I)V
    .registers 5

    .line 428
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 v1, p2, 0x12

    and-int/lit8 v1, v1, 0x3f

    aget-char v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 429
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 v1, p2, 0xc

    and-int/lit8 v1, v1, 0x3f

    aget-char v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 430
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 v1, p2, 0x6

    and-int/lit8 v1, v1, 0x3f

    aget-char v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 431
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    and-int/lit8 p2, p2, 0x3f

    aget-char p0, p0, p2

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final encodeBase64Partial(II[BI)I
    .registers 9

    .line 518
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiB:[B

    shr-int/lit8 v1, p1, 0x12

    and-int/lit8 v1, v1, 0x3f

    aget-byte v1, v0, v1

    aput-byte v1, p3, p4

    add-int/lit8 v1, p4, 0x2

    add-int/lit8 v2, p4, 0x1

    shr-int/lit8 v3, p1, 0xc

    and-int/lit8 v3, v3, 0x3f

    .line 519
    aget-byte v0, v0, v3

    aput-byte v0, p3, v2

    .line 520
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    move-result v0

    const/4 v2, 0x2

    if-eqz v0, :cond_35

    .line 521
    iget-char v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    int-to-byte v0, v0

    if-ne p2, v2, :cond_2b

    .line 522
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiB:[B

    shr-int/lit8 p1, p1, 0x6

    and-int/lit8 p1, p1, 0x3f

    aget-byte p0, p0, p1

    goto :goto_2c

    :cond_2b
    move p0, v0

    :goto_2c
    aput-byte p0, p3, v1

    add-int/lit8 p0, p4, 0x3

    .line 524
    aput-byte v0, p3, p0

    add-int/lit8 p4, p4, 0x4

    return p4

    :cond_35
    if-ne p2, v2, :cond_44

    .line 527
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiB:[B

    shr-int/lit8 p1, p1, 0x6

    and-int/lit8 p1, p1, 0x3f

    aget-byte p0, p0, p1

    aput-byte p0, p3, v1

    add-int/lit8 p4, p4, 0x3

    return p4

    :cond_44
    return v1
.end method

.method public final encodeBase64Partial(II[CI)I
    .registers 9

    .line 449
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 v1, p1, 0x12

    and-int/lit8 v1, v1, 0x3f

    aget-char v1, v0, v1

    aput-char v1, p3, p4

    add-int/lit8 v1, p4, 0x2

    add-int/lit8 v2, p4, 0x1

    shr-int/lit8 v3, p1, 0xc

    and-int/lit8 v3, v3, 0x3f

    .line 450
    aget-char v0, v0, v3

    aput-char v0, p3, v2

    .line 451
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    move-result v0

    const/4 v2, 0x2

    if-eqz v0, :cond_35

    if-ne p2, v2, :cond_28

    .line 452
    iget-object p2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 p1, p1, 0x6

    and-int/lit8 p1, p1, 0x3f

    aget-char p1, p2, p1

    goto :goto_2a

    :cond_28
    iget-char p1, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    :goto_2a
    aput-char p1, p3, v1

    add-int/lit8 p1, p4, 0x3

    .line 454
    iget-char p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    aput-char p0, p3, p1

    add-int/lit8 p4, p4, 0x4

    return p4

    :cond_35
    if-ne p2, v2, :cond_44

    .line 457
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 p1, p1, 0x6

    and-int/lit8 p1, p1, 0x3f

    aget-char p0, p0, p1

    aput-char p0, p3, v1

    add-int/lit8 p4, p4, 0x3

    return p4

    :cond_44
    return v1
.end method

.method public final encodeBase64Partial(Ljava/lang/StringBuilder;II)V
    .registers 6

    .line 465
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 v1, p2, 0x12

    and-int/lit8 v1, v1, 0x3f

    aget-char v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 466
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 v1, p2, 0xc

    and-int/lit8 v1, v1, 0x3f

    aget-char v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 467
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->usesPadding()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_33

    if-ne p3, v1, :cond_28

    .line 468
    iget-object p3, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 p2, p2, 0x6

    and-int/lit8 p2, p2, 0x3f

    aget-char p2, p3, p2

    goto :goto_2a

    :cond_28
    iget-char p2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    :goto_2a
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 470
    iget-char p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_33
    if-ne p3, v1, :cond_40

    .line 473
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_base64ToAsciiC:[C

    shr-int/lit8 p2, p2, 0x6

    and-int/lit8 p2, p2, 0x3f

    aget-char p0, p0, p2

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_40
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_35

    .line 805
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_35

    .line 807
    check-cast p1, Lcom/fasterxml/jackson/core/Base64Variant;

    .line 808
    iget-char v1, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    iget-char v2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    if-ne v1, v2, :cond_35

    iget v1, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_maxLineLength:I

    iget v2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_maxLineLength:I

    if-ne v1, v2, :cond_35

    iget-boolean v1, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_writePadding:Z

    iget-boolean v2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_writePadding:Z

    if-ne v1, v2, :cond_35

    iget-object v1, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    iget-object v2, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    if-ne v1, v2, :cond_35

    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_name:Ljava/lang/String;

    iget-object p1, p1, Lcom/fasterxml/jackson/core/Base64Variant;->_name:Ljava/lang/String;

    .line 812
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_35

    return v0

    :cond_35
    const/4 p0, 0x0

    return p0
.end method

.method public final getMaxLineLength()I
    .registers 1

    .line 358
    iget p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_maxLineLength:I

    return p0
.end method

.method public final getName()Ljava/lang/String;
    .registers 1

    .line 318
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_name:Ljava/lang/String;

    return-object p0
.end method

.method public final getPaddingChar()C
    .registers 1

    .line 355
    iget-char p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    return p0
.end method

.method public final hashCode()I
    .registers 1

    .line 818
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_name:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public final missingPaddingMessage()Ljava/lang/String;
    .registers 2

    .line 884
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->getPaddingChar()C

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 883
    const-string v0, "Unexpected end of base64-encoded String: base64 variant \'%s\' expects padding (one or more \'%c\' characters) at the end. This Base64Variant might have been incorrectly configured"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected final readResolve()Ljava/lang/Object;
    .registers 9

    .line 299
    iget-object v0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_name:Ljava/lang/String;

    invoke-static {v0}, Lcom/fasterxml/jackson/core/Base64Variants;->valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/core/Base64Variant;

    move-result-object v2

    .line 300
    iget-boolean v4, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_writePadding:Z

    iget-boolean v0, v2, Lcom/fasterxml/jackson/core/Base64Variant;->_writePadding:Z

    if-ne v4, v0, :cond_21

    iget-char v1, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    iget-char v3, v2, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    if-ne v1, v3, :cond_21

    iget-object v1, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    iget-object v3, v2, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    if-ne v1, v3, :cond_21

    iget v1, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_maxLineLength:I

    iget v3, v2, Lcom/fasterxml/jackson/core/Base64Variant;->_maxLineLength:I

    if-ne v1, v3, :cond_21

    if-ne v4, v0, :cond_21

    return-object v2

    .line 306
    :cond_21
    new-instance v0, Lcom/fasterxml/jackson/core/Base64Variant;

    iget-object v3, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_name:Ljava/lang/String;

    iget-char v5, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    iget-object v6, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    iget v7, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_maxLineLength:I

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/fasterxml/jackson/core/Base64Variant;-><init>(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/lang/String;ZCLcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;I)V

    return-object v0
.end method

.method public final requiresPaddingOnRead()Z
    .registers 2

    .line 332
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingReadBehaviour:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    sget-object v0, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->PADDING_REQUIRED:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    if-ne p0, v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 1

    .line 798
    iget-object p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_name:Ljava/lang/String;

    return-object p0
.end method

.method protected final unexpectedPaddingMessage()Ljava/lang/String;
    .registers 2

    .line 871
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/Base64Variant;->getName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 870
    const-string v0, "Unexpected end of base64-encoded String: base64 variant \'%s\' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final usesPadding()Z
    .registers 1

    .line 324
    iget-boolean p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_writePadding:Z

    return p0
.end method

.method public final usesPaddingChar(C)Z
    .registers 2

    .line 344
    iget-char p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    if-ne p1, p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final usesPaddingChar(I)Z
    .registers 2

    .line 345
    iget-char p0, p0, Lcom/fasterxml/jackson/core/Base64Variant;->_paddingChar:C

    if-ne p1, p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

###### Class com.fasterxml.jackson.core.Base64Variant.PaddingReadBehaviour (com.fasterxml.jackson.core.Base64Variant$PaddingReadBehaviour)
.class public final enum Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/Base64Variant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PaddingReadBehaviour"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

.field public static final enum PADDING_ALLOWED:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

.field public static final enum PADDING_FORBIDDEN:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

.field public static final enum PADDING_REQUIRED:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 32
    new-instance v0, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    const-string v1, "PADDING_FORBIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->PADDING_FORBIDDEN:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    .line 38
    new-instance v1, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    const-string v2, "PADDING_REQUIRED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->PADDING_REQUIRED:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    .line 45
    new-instance v2, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    const-string v3, "PADDING_ALLOWED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->PADDING_ALLOWED:Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    .line 27
    filled-new-array {v0, v1, v2}, [Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->$VALUES:[Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;
    .registers 2

    .line 27
    const-class v0, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;
    .registers 1

    .line 27
    sget-object v0, Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->$VALUES:[Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/core/Base64Variant$PaddingReadBehaviour;

    return-object v0
.end method
