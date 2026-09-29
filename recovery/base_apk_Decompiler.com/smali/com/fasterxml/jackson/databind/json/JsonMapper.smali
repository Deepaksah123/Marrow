###### Class com.fasterxml.jackson.databind.json.JsonMapper (com.fasterxml.jackson.databind.json.JsonMapper)
.class public Lcom/fasterxml/jackson/databind/json/JsonMapper;
.super Lcom/fasterxml/jackson/databind/ObjectMapper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 89
    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/json/JsonMapper;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonFactory;)V
    .registers 2

    .line 93
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;)V

    return-void
.end method

.method public static builder()Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;
    .registers 2

    .line 114
    new-instance v0, Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;

    new-instance v1, Lcom/fasterxml/jackson/databind/json/JsonMapper;

    invoke-direct {v1}, Lcom/fasterxml/jackson/databind/json/JsonMapper;-><init>()V

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;-><init>(Lcom/fasterxml/jackson/databind/json/JsonMapper;)V

    return-object v0
.end method


# virtual methods
.method public getFactory()Lcom/fasterxml/jackson/core/JsonFactory;
    .registers 1

    .line 140
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/ObjectMapper;->_jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

    return-object p0
.end method

###### Class com.fasterxml.jackson.databind.json.JsonMapper.Builder (com.fasterxml.jackson.databind.json.JsonMapper$Builder)
.class public Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;
.super Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/json/JsonMapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/cfg/MapperBuilder<",
        "Lcom/fasterxml/jackson/databind/json/JsonMapper;",
        "Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/json/JsonMapper;)V
    .registers 2

    .line 30
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-void
.end method
