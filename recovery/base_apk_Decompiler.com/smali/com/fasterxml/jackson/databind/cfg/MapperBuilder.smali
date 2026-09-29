###### Class com.fasterxml.jackson.databind.cfg.MapperBuilder (com.fasterxml.jackson.databind.cfg.MapperBuilder)
.class public abstract Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Lcom/fasterxml/jackson/databind/ObjectMapper;",
        "B:",
        "Lcom/fasterxml/jackson/databind/cfg/MapperBuilder<",
        "TM;TB;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final _mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TM;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TM;)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;->_mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    return-void
.end method


# virtual methods
.method protected final _this()Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation

    return-object p0
.end method

.method public addModule(Lcom/fasterxml/jackson/databind/Module;)Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/Module;",
            ")TB;"
        }
    .end annotation

    .line 346
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;->_mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->registerModule(Lcom/fasterxml/jackson/databind/Module;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 347
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;->_this()Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;

    move-result-object p0

    return-object p0
.end method

.method public build()Lcom/fasterxml/jackson/databind/ObjectMapper;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TM;"
        }
    .end annotation

    .line 62
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/cfg/MapperBuilder;->_mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    return-object p0
.end method
