###### Class com.fasterxml.jackson.core.json.JsonReadContext (com.fasterxml.jackson.core.json.JsonReadContext)
.class public final Lcom/fasterxml/jackson/core/json/JsonReadContext;
.super Lcom/fasterxml/jackson/core/JsonStreamContext;
.source "SourceFile"


# instance fields
.field protected _child:Lcom/fasterxml/jackson/core/json/JsonReadContext;

.field protected _columnNr:I

.field protected _currentName:Ljava/lang/String;

.field protected _currentValue:Ljava/lang/Object;

.field protected _dups:Lcom/fasterxml/jackson/core/json/DupDetector;

.field protected _lineNr:I

.field protected final _parent:Lcom/fasterxml/jackson/core/json/JsonReadContext;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/json/JsonReadContext;ILcom/fasterxml/jackson/core/json/DupDetector;III)V
    .registers 7

    .line 61
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/JsonStreamContext;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_parent:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    .line 63
    iput-object p3, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_dups:Lcom/fasterxml/jackson/core/json/DupDetector;

    .line 64
    iput p4, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    .line 65
    iput p5, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_lineNr:I

    .line 66
    iput p6, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_columnNr:I

    const/4 p1, -0x1

    .line 67
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    .line 68
    iput p2, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_nestingDepth:I

    return-void
.end method

.method private _checkDup(Lcom/fasterxml/jackson/core/json/DupDetector;Ljava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonProcessingException;
        }
    .end annotation

    .line 241
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/json/DupDetector;->isDup(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2b

    .line 242
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/json/DupDetector;->getSource()Ljava/lang/Object;

    move-result-object p0

    .line 243
    instance-of p1, p0, Lcom/fasterxml/jackson/core/JsonParser;

    if-eqz p1, :cond_11

    check-cast p0, Lcom/fasterxml/jackson/core/JsonParser;

    goto :goto_12

    :cond_11
    const/4 p0, 0x0

    :goto_12
    new-instance p1, Lcom/fasterxml/jackson/core/JsonParseException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Duplicate field \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\'"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p0, p2}, Lcom/fasterxml/jackson/core/JsonParseException;-><init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V

    throw p1

    :cond_2b
    return-void
.end method

.method public static createRootContext(Lcom/fasterxml/jackson/core/json/DupDetector;)Lcom/fasterxml/jackson/core/json/JsonReadContext;
    .registers 9

    .line 141
    new-instance v7, Lcom/fasterxml/jackson/core/json/JsonReadContext;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, v7

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/core/json/JsonReadContext;-><init>(Lcom/fasterxml/jackson/core/json/JsonReadContext;ILcom/fasterxml/jackson/core/json/DupDetector;III)V

    return-object v7
.end method


# virtual methods
.method public final clearAndGetParent()Lcom/fasterxml/jackson/core/json/JsonReadContext;
    .registers 2

    const/4 v0, 0x0

    .line 211
    iput-object v0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_currentValue:Ljava/lang/Object;

    .line 213
    iget-object p0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_parent:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    return-object p0
.end method

.method public final createChildArrayContext(II)Lcom/fasterxml/jackson/core/json/JsonReadContext;
    .registers 13

    .line 145
    iget-object v0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_child:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    const/4 v1, 0x1

    if-nez v0, :cond_21

    .line 147
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_nestingDepth:I

    iget-object v2, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_dups:Lcom/fasterxml/jackson/core/json/DupDetector;

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_11

    .line 148
    :cond_d
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/json/DupDetector;->child()Lcom/fasterxml/jackson/core/json/DupDetector;

    move-result-object v2

    :goto_11
    move-object v6, v2

    new-instance v2, Lcom/fasterxml/jackson/core/json/JsonReadContext;

    add-int/lit8 v5, v0, 0x1

    const/4 v7, 0x1

    move-object v3, v2

    move-object v4, p0

    move v8, p1

    move v9, p2

    invoke-direct/range {v3 .. v9}, Lcom/fasterxml/jackson/core/json/JsonReadContext;-><init>(Lcom/fasterxml/jackson/core/json/JsonReadContext;ILcom/fasterxml/jackson/core/json/DupDetector;III)V

    iput-object v2, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_child:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    return-object v2

    .line 150
    :cond_21
    invoke-virtual {v0, v1, p1, p2}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->reset(III)V

    return-object v0
.end method

.method public final createChildObjectContext(II)Lcom/fasterxml/jackson/core/json/JsonReadContext;
    .registers 12

    .line 156
    iget-object v0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_child:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    if-nez v0, :cond_20

    .line 158
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_nestingDepth:I

    iget-object v1, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_dups:Lcom/fasterxml/jackson/core/json/DupDetector;

    if-nez v1, :cond_c

    const/4 v1, 0x0

    goto :goto_10

    .line 159
    :cond_c
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/json/DupDetector;->child()Lcom/fasterxml/jackson/core/json/DupDetector;

    move-result-object v1

    :goto_10
    move-object v5, v1

    new-instance v1, Lcom/fasterxml/jackson/core/json/JsonReadContext;

    add-int/lit8 v4, v0, 0x1

    const/4 v6, 0x2

    move-object v2, v1

    move-object v3, p0

    move v7, p1

    move v8, p2

    invoke-direct/range {v2 .. v8}, Lcom/fasterxml/jackson/core/json/JsonReadContext;-><init>(Lcom/fasterxml/jackson/core/json/JsonReadContext;ILcom/fasterxml/jackson/core/json/DupDetector;III)V

    iput-object v1, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_child:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    return-object v1

    :cond_20
    const/4 p0, 0x2

    .line 162
    invoke-virtual {v0, p0, p1, p2}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->reset(III)V

    return-object v0
.end method

.method public final expectComma()Z
    .registers 3

    .line 231
    iget v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    .line 232
    iget p0, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    if-eqz p0, :cond_d

    if-lez v0, :cond_d

    return v1

    :cond_d
    const/4 p0, 0x0

    return p0
.end method

.method public final getCurrentName()Ljava/lang/String;
    .registers 1

    .line 172
    iget-object p0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_currentName:Ljava/lang/String;

    return-object p0
.end method

.method public final getCurrentValue()Ljava/lang/Object;
    .registers 1

    .line 122
    iget-object p0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_currentValue:Ljava/lang/Object;

    return-object p0
.end method

.method public final getDupDetector()Lcom/fasterxml/jackson/core/json/DupDetector;
    .registers 1

    .line 217
    iget-object p0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_dups:Lcom/fasterxml/jackson/core/json/DupDetector;

    return-object p0
.end method

.method public final bridge synthetic getParent()Lcom/fasterxml/jackson/core/JsonStreamContext;
    .registers 1

    .line 11
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->getParent()Lcom/fasterxml/jackson/core/json/JsonReadContext;

    move-result-object p0

    return-object p0
.end method

.method public final getParent()Lcom/fasterxml/jackson/core/json/JsonReadContext;
    .registers 1

    .line 177
    iget-object p0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_parent:Lcom/fasterxml/jackson/core/json/JsonReadContext;

    return-object p0
.end method

.method public final hasCurrentName()Z
    .registers 1

    .line 175
    iget-object p0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_currentName:Ljava/lang/String;

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public final reset(III)V
    .registers 4

    .line 98
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_type:I

    const/4 p1, -0x1

    .line 99
    iput p1, p0, Lcom/fasterxml/jackson/core/JsonStreamContext;->_index:I

    .line 100
    iput p2, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_lineNr:I

    .line 101
    iput p3, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_columnNr:I

    const/4 p1, 0x0

    .line 102
    iput-object p1, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_currentName:Ljava/lang/String;

    .line 103
    iput-object p1, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_currentValue:Ljava/lang/Object;

    .line 104
    iget-object p0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_dups:Lcom/fasterxml/jackson/core/json/DupDetector;

    if-eqz p0, :cond_15

    .line 105
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/json/DupDetector;->reset()V

    :cond_15
    return-void
.end method

.method public final setCurrentName(Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/JsonProcessingException;
        }
    .end annotation

    .line 236
    iput-object p1, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_currentName:Ljava/lang/String;

    .line 237
    iget-object v0, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_dups:Lcom/fasterxml/jackson/core/json/DupDetector;

    if-eqz v0, :cond_9

    invoke-direct {p0, v0, p1}, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_checkDup(Lcom/fasterxml/jackson/core/json/DupDetector;Ljava/lang/String;)V

    :cond_9
    return-void
.end method

.method public final setCurrentValue(Ljava/lang/Object;)V
    .registers 2

    .line 127
    iput-object p1, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_currentValue:Ljava/lang/Object;

    return-void
.end method

.method public final startLocation(Lcom/fasterxml/jackson/core/io/ContentReference;)Lcom/fasterxml/jackson/core/JsonLocation;
    .registers 9

    .line 183
    new-instance v6, Lcom/fasterxml/jackson/core/JsonLocation;

    const-wide/16 v2, -0x1

    iget v4, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_lineNr:I

    iget v5, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_columnNr:I

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Lcom/fasterxml/jackson/core/io/ContentReference;JII)V

    return-object v6
.end method

.method public final withDupDetector(Lcom/fasterxml/jackson/core/json/DupDetector;)Lcom/fasterxml/jackson/core/json/JsonReadContext;
    .registers 2

    .line 116
    iput-object p1, p0, Lcom/fasterxml/jackson/core/json/JsonReadContext;->_dups:Lcom/fasterxml/jackson/core/json/DupDetector;

    return-object p0
.end method
