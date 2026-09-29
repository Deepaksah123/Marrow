###### Class com.fasterxml.jackson.core.JsonStreamContext (com.fasterxml.jackson.core.JsonStreamContext)
.class public abstract Lcom/fasterxml/jackson/core/JsonStreamContext;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public _index:I

.field public _nestingDepth:I

.field public _type:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(II)V
    .registers 3

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    .line 87
    iput p2, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonStreamContext;)V
    .registers 3

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iget v0, p1, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    .line 81
    iget p1, p1, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    iput p1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    return-void
.end method


# virtual methods
.method public final getCurrentIndex()I
    .registers 1

    .line 180
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    if-gez p0, :cond_5

    const/4 p0, 0x0

    :cond_5
    return p0
.end method

.method public abstract getCurrentName()Ljava/lang/String;
.end method

.method public getCurrentValue()Ljava/lang/Object;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public final getEntryCount()I
    .registers 1

    .line 175
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public final getNestingDepth()I
    .registers 1

    .line 136
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_nestingDepth:I

    return p0
.end method

.method public abstract getParent()Lcom/fasterxml/jackson/core/JsonStreamContext;
.end method

.method public hasCurrentIndex()Z
    .registers 1

    .line 191
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    if-ltz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public hasCurrentName()Z
    .registers 1

    .line 236
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->getCurrentName()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final inArray()Z
    .registers 2

    .line 110
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_6

    return v0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final inObject()Z
    .registers 2

    .line 127
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    const/4 v0, 0x2

    if-ne p0, v0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method

.method public final inRoot()Z
    .registers 1

    .line 119
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    if-nez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public setCurrentValue(Ljava/lang/Object;)V
    .registers 2

    return-void
.end method

.method public startLocation(Lcom/fasterxml/jackson/core/io/ContentReference;)Lcom/fasterxml/jackson/core/JsonLocation;
    .registers 2

    .line 310
    sget-object p0, Lcom/fasterxml/jackson/core/JsonLocation;->NA:Lcom/fasterxml/jackson/core/JsonLocation;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 337
    iget v1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    if-eqz v1, :cond_42

    const/4 v2, 0x1

    if-eq v1, v2, :cond_30

    const/16 v1, 0x7b

    .line 348
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 349
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->getCurrentName()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_25

    const/16 v1, 0x22

    .line 351
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 352
    invoke-static {v0, p0}, Lcom/fasterxml/jackson/core/io/CharTypes;->appendQuoted(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 353
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2a

    :cond_25
    const/16 p0, 0x3f

    .line 355
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2a
    const/16 p0, 0x7d

    .line 357
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_47

    :cond_30
    const/16 v1, 0x5b

    .line 342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 343
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->getCurrentIndex()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    .line 344
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_47

    .line 339
    :cond_42
    const-string p0, "/"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    :goto_47
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public typeDesc()Ljava/lang/String;
    .registers 2

    .line 164
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    if-eqz p0, :cond_13

    const/4 v0, 0x1

    if-eq p0, v0, :cond_10

    const/4 v0, 0x2

    if-eq p0, v0, :cond_d

    .line 169
    const-string p0, "?"

    return-object p0

    .line 167
    :cond_d
    const-string p0, "Object"

    return-object p0

    .line 166
    :cond_10
    const-string p0, "Array"

    return-object p0

    .line 165
    :cond_13
    const-string p0, "root"

    return-object p0
.end method
