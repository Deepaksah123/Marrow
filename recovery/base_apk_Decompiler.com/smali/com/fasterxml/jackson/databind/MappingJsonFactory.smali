###### Class com.fasterxml.jackson.databind.MappingJsonFactory (com.fasterxml.jackson.databind.MappingJsonFactory)
.class public Lcom/fasterxml/jackson/databind/MappingJsonFactory;
.super Lcom/fasterxml/jackson/core/JsonFactory;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/MappingJsonFactory;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .registers 2

    .line 29
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>(Lcom/fasterxml/jackson/core/ObjectCodec;)V

    if-nez p1, :cond_d

    .line 31
    new-instance p1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {p1, p0}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;)V

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->setCodec(Lcom/fasterxml/jackson/core/ObjectCodec;)Lcom/fasterxml/jackson/core/JsonFactory;

    :cond_d
    return-void
.end method


# virtual methods
.method public bridge synthetic getCodec()Lcom/fasterxml/jackson/core/ObjectCodec;
    .registers 1

    .line 17
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/MappingJsonFactory;->getCodec()Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-result-object p0

    return-object p0
.end method

.method public final getCodec()Lcom/fasterxml/jackson/databind/ObjectMapper;
    .registers 1

    .line 48
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    check-cast p0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    return-object p0
.end method

.method public getFormatName()Ljava/lang/String;
    .registers 1

    .line 74
    const-string p0, "JSON"

    return-object p0
.end method

.method public hasFormat(Lcom/fasterxml/jackson/core/format/InputAccessor;)Lcom/fasterxml/jackson/core/format/MatchStrength;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/fasterxml/jackson/databind/MappingJsonFactory;

    if-ne v0, v1, :cond_d

    .line 84
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/MappingJsonFactory;->hasJSONFormat(Lcom/fasterxml/jackson/core/format/InputAccessor;)Lcom/fasterxml/jackson/core/format/MatchStrength;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method
