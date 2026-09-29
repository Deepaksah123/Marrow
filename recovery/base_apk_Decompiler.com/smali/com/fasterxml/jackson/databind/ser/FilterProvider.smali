###### Class com.fasterxml.jackson.databind.ser.FilterProvider (com.fasterxml.jackson.databind.ser.FilterProvider)
.class public abstract Lcom/fasterxml/jackson/databind/ser/FilterProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract findFilter(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public findPropertyFilter(Ljava/lang/Object;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/ser/PropertyFilter;
    .registers 3

    .line 52
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/ser/FilterProvider;->findFilter(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;

    move-result-object p0

    if-nez p0, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 56
    :cond_8
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/ser/impl/SimpleBeanPropertyFilter;->from(Lcom/fasterxml/jackson/databind/ser/BeanPropertyFilter;)Lcom/fasterxml/jackson/databind/ser/PropertyFilter;

    move-result-object p0

    return-object p0
.end method
