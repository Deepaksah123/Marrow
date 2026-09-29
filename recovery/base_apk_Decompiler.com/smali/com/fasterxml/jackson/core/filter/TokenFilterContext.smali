###### Class com.fasterxml.jackson.core.filter.TokenFilterContext (com.fasterxml.jackson.core.filter.TokenFilterContext)
.class public Lcom/fasterxml/jackson/core/filter/TokenFilterContext;
.super Lcom/fasterxml/jackson/core/JsonStreamContext;
.source "SourceFile"


# instance fields
.field protected _child:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

.field protected _currentName:Ljava/lang/String;

.field protected _filter:Lcom/fasterxml/jackson/core/filter/TokenFilter;

.field protected _needToHandleName:Z

.field protected final _parent:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

.field protected _startHandled:Z


# direct methods
.method protected constructor <init>(ILcom/fasterxml/jackson/core/filter/TokenFilterContext;Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)V
    .registers 5

    .line 71
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/JsonStreamContext;-><init>()V

    .line 72
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    .line 73
    iput-object p2, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_parent:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    .line 74
    iput-object p3, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_filter:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    const/4 p1, -0x1

    .line 75
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    .line 76
    iput-boolean p4, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_startHandled:Z

    const/4 p1, 0x0

    .line 77
    iput-boolean p1, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_needToHandleName:Z

    return-void
.end method

.method public static createRootContext(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilterContext;
    .registers 5

    .line 100
    new-instance v0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, p0, v2}, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;-><init>(ILcom/fasterxml/jackson/core/filter/TokenFilterContext;Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)V

    return-object v0
.end method


# virtual methods
.method protected appendDesc(Ljava/lang/StringBuilder;)V
    .registers 4

    .line 337
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_parent:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    if-eqz v0, :cond_7

    .line 338
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->appendDesc(Ljava/lang/StringBuilder;)V

    .line 340
    :cond_7
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2e

    const/16 v0, 0x7b

    .line 341
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 342
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_currentName:Ljava/lang/String;

    if-eqz v0, :cond_23

    const/16 v0, 0x22

    .line 343
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 345
    iget-object p0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_currentName:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_28

    :cond_23
    const/16 p0, 0x3f

    .line 348
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_28
    const/16 p0, 0x7d

    .line 350
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 351
    :cond_2e
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_45

    const/16 v0, 0x5b

    .line 352
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 353
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonStreamContext;->getCurrentIndex()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    .line 354
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 357
    :cond_45
    const-string p0, "/"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public checkValue(Lcom/fasterxml/jackson/core/filter/TokenFilter;)Lcom/fasterxml/jackson/core/filter/TokenFilter;
    .registers 4

    .line 143
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    return-object p1

    .line 147
    :cond_6
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    .line 148
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    if-ne p0, v1, :cond_15

    .line 149
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->includeElement(I)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    move-result-object p0

    return-object p0

    .line 151
    :cond_15
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/filter/TokenFilter;->includeRootValue(I)Lcom/fasterxml/jackson/core/filter/TokenFilter;

    move-result-object p0

    return-object p0
.end method

.method public createChildArrayContext(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lcom/fasterxml/jackson/core/filter/TokenFilterContext;
    .registers 5

    .line 104
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_child:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    const/4 v1, 0x1

    if-nez v0, :cond_d

    .line 106
    new-instance v0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    invoke-direct {v0, v1, p0, p1, p2}, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;-><init>(ILcom/fasterxml/jackson/core/filter/TokenFilterContext;Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)V

    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_child:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    return-object v0

    .line 109
    :cond_d
    invoke-virtual {v0, v1, p1, p2}, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->reset(ILcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    move-result-object p0

    return-object p0
.end method

.method public createChildObjectContext(Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lcom/fasterxml/jackson/core/filter/TokenFilterContext;
    .registers 5

    .line 113
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_child:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    const/4 v1, 0x2

    if-nez v0, :cond_d

    .line 115
    new-instance v0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    invoke-direct {v0, v1, p0, p1, p2}, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;-><init>(ILcom/fasterxml/jackson/core/filter/TokenFilterContext;Lcom/fasterxml/jackson/core/filter/TokenFilter;Z)V

    iput-object v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_child:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    return-object v0

    .line 118
    :cond_d
    invoke-virtual {v0, v1, p1, p2}, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->reset(ILcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    move-result-object p0

    return-object p0
.end method

.method public findChildOf(Lcom/fasterxml/jackson/core/filter/TokenFilterContext;)Lcom/fasterxml/jackson/core/filter/TokenFilterContext;
    .registers 3

    .line 319
    iget-object v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_parent:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    if-ne v0, p1, :cond_5

    return-object p0

    :cond_5
    :goto_5
    if-eqz v0, :cond_e

    .line 324
    iget-object p0, v0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_parent:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    if-ne p0, p1, :cond_c

    return-object v0

    :cond_c
    move-object v0, p0

    goto :goto_5

    :cond_e
    const/4 p0, 0x0

    return-object p0
.end method

.method public final getCurrentName()Ljava/lang/String;
    .registers 1

    .line 294
    iget-object p0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_currentName:Ljava/lang/String;

    return-object p0
.end method

.method public getCurrentValue()Ljava/lang/Object;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public getFilter()Lcom/fasterxml/jackson/core/filter/TokenFilter;
    .registers 1

    .line 298
    iget-object p0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_filter:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    return-object p0
.end method

.method public bridge synthetic getParent()Lcom/fasterxml/jackson/core/JsonStreamContext;
    .registers 1

    .line 13
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->getParent()Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    move-result-object p0

    return-object p0
.end method

.method public final getParent()Lcom/fasterxml/jackson/core/filter/TokenFilterContext;
    .registers 1

    .line 293
    iget-object p0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_parent:Lcom/fasterxml/jackson/core/filter/TokenFilterContext;

    return-object p0
.end method

.method public hasCurrentName()Z
    .registers 1

    .line 296
    iget-object p0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_currentName:Ljava/lang/String;

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public isStartHandled()Z
    .registers 1

    .line 299
    iget-boolean p0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_startHandled:Z

    return p0
.end method

.method public nextTokenToRead()Lcom/fasterxml/jackson/core/JsonToken;
    .registers 3

    .line 302
    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_startHandled:Z

    const/4 v1, 0x2

    if-nez v0, :cond_12

    const/4 v0, 0x1

    .line 303
    iput-boolean v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_startHandled:Z

    .line 304
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    if-ne p0, v1, :cond_f

    .line 305
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->START_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0

    .line 308
    :cond_f
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0

    .line 311
    :cond_12
    iget-boolean v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_needToHandleName:Z

    if-eqz v0, :cond_20

    iget v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    if-ne v0, v1, :cond_20

    const/4 v0, 0x0

    .line 312
    iput-boolean v0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_needToHandleName:Z

    .line 313
    sget-object p0, Lcom/fasterxml/jackson/core/JsonToken;->FIELD_NAME:Lcom/fasterxml/jackson/core/JsonToken;

    return-object p0

    :cond_20
    const/4 p0, 0x0

    return-object p0
.end method

.method protected reset(ILcom/fasterxml/jackson/core/filter/TokenFilter;Z)Lcom/fasterxml/jackson/core/filter/TokenFilterContext;
    .registers 4

    .line 83
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    .line 84
    iput-object p2, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_filter:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    const/4 p1, -0x1

    .line 85
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    const/4 p1, 0x0

    .line 86
    iput-object p1, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_currentName:Ljava/lang/String;

    .line 87
    iput-boolean p3, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_startHandled:Z

    const/4 p1, 0x0

    .line 88
    iput-boolean p1, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_needToHandleName:Z

    return-object p0
.end method

.method public setCurrentValue(Ljava/lang/Object;)V
    .registers 2

    return-void
.end method

.method public setFieldName(Ljava/lang/String;)Lcom/fasterxml/jackson/core/filter/TokenFilter;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonProcessingException;
        }
    .end annotation

    .line 128
    iput-object p1, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_currentName:Ljava/lang/String;

    const/4 p1, 0x1

    .line 129
    iput-boolean p1, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_needToHandleName:Z

    .line 130
    iget-object p0, p0, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->_filter:Lcom/fasterxml/jackson/core/filter/TokenFilter;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 366
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 367
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/filter/TokenFilterContext;->appendDesc(Ljava/lang/StringBuilder;)V

    .line 368
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
