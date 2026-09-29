###### Class com.fasterxml.jackson.core.StreamReadConstraints (com.fasterxml.jackson.core.StreamReadConstraints)
.class public Lcom/fasterxml/jackson/core/StreamReadConstraints;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final DEFAULT:Lcom/fasterxml/jackson/core/StreamReadConstraints;


# instance fields
.field protected final _maxNestingDepth:I

.field protected final _maxNumLen:I

.field protected final _maxStringLen:I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 57
    new-instance v0, Lcom/fasterxml/jackson/core/StreamReadConstraints;

    const/16 v1, 0x3e8

    const v2, 0x4c4b40

    invoke-direct {v0, v1, v1, v2}, Lcom/fasterxml/jackson/core/StreamReadConstraints;-><init>(III)V

    sput-object v0, Lcom/fasterxml/jackson/core/StreamReadConstraints;->DEFAULT:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    return-void
.end method

.method protected constructor <init>(III)V
    .registers 4

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    iput p1, p0, Lcom/fasterxml/jackson/core/StreamReadConstraints;->_maxNestingDepth:I

    .line 151
    iput p2, p0, Lcom/fasterxml/jackson/core/StreamReadConstraints;->_maxNumLen:I

    .line 152
    iput p3, p0, Lcom/fasterxml/jackson/core/StreamReadConstraints;->_maxStringLen:I

    return-void
.end method

.method public static defaults()Lcom/fasterxml/jackson/core/StreamReadConstraints;
    .registers 1

    .line 160
    sget-object v0, Lcom/fasterxml/jackson/core/StreamReadConstraints;->DEFAULT:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    return-object v0
.end method


# virtual methods
.method public validateBigIntegerScale(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 314
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p0

    const v0, 0x186a0

    if-gt p0, v0, :cond_a

    return-void

    .line 320
    :cond_a
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    .line 318
    new-instance p1, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;

    const-string v0, "BigDecimal scale (%d) magnitude exceeds maximum allowed (%d)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public validateFPLength(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 251
    iget p0, p0, Lcom/fasterxml/jackson/core/StreamReadConstraints;->_maxNumLen:I

    if-gt p1, p0, :cond_5

    return-void

    .line 253
    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 252
    new-instance p1, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;

    const-string v0, "Number length (%d) exceeds the maximum length (%d)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public validateIntegerLength(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 270
    iget p0, p0, Lcom/fasterxml/jackson/core/StreamReadConstraints;->_maxNumLen:I

    if-gt p1, p0, :cond_5

    return-void

    .line 272
    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 271
    new-instance p1, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;

    const-string v0, "Number length (%d) exceeds the maximum length (%d)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public validateNestingDepth(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 226
    iget p0, p0, Lcom/fasterxml/jackson/core/StreamReadConstraints;->_maxNestingDepth:I

    if-gt p1, p0, :cond_5

    return-void

    .line 228
    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 227
    new-instance p1, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;

    const-string v0, "Depth (%d) exceeds the maximum allowed nesting depth (%d)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public validateStringLength(I)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 289
    iget p0, p0, Lcom/fasterxml/jackson/core/StreamReadConstraints;->_maxStringLen:I

    if-gt p1, p0, :cond_5

    return-void

    .line 291
    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 290
    new-instance p1, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;

    const-string v0, "String length (%d) exceeds the maximum length (%d)"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
