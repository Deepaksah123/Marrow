###### Class com.fasterxml.jackson.core.JsonParseException (com.fasterxml.jackson.core.JsonParseException)
.class public Lcom/fasterxml/jackson/core/JsonParseException;
.super Lcom/fasterxml/jackson/core/exc/StreamReadException;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V
    .registers 3

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/core/exc/StreamReadException;-><init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 4

    .line 47
    invoke-direct {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/exc/StreamReadException;-><init>(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .registers 1

    .line 122
    invoke-super {p0}, Lcom/fasterxml/jackson/core/exc/StreamReadException;->getMessage()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public getProcessor()Lcom/fasterxml/jackson/core/JsonParser;
    .registers 1

    .line 104
    invoke-super {p0}, Lcom/fasterxml/jackson/core/exc/StreamReadException;->getProcessor()Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getProcessor()Ljava/lang/Object;
    .registers 1

    .line 16
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/exc/StreamReadException;->getProcessor()Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0
.end method

.method public withRequestPayload(Lcom/fasterxml/jackson/core/util/RequestPayload;)Lcom/fasterxml/jackson/core/JsonParseException;
    .registers 2

    .line 97
    iput-object p1, p0, Lcom/fasterxml/jackson/core/exc/StreamReadException;->_requestPayload:Lcom/fasterxml/jackson/core/util/RequestPayload;

    return-object p0
.end method
