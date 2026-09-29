###### Class com.fasterxml.jackson.core.util.DefaultIndenter (com.fasterxml.jackson.core.util.DefaultIndenter)
.class public Lcom/fasterxml/jackson/core/util/DefaultIndenter;
.super Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter;
.source "SourceFile"


# static fields
.field public static final SYSTEM_LINEFEED_INSTANCE:Lcom/fasterxml/jackson/core/util/DefaultIndenter;

.field public static final SYS_LF:Ljava/lang/String;


# instance fields
.field private final charsPerLevel:I

.field private final eol:Ljava/lang/String;

.field private final indents:[C


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 22
    :try_start_0
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_0 .. :try_end_6} :catchall_7

    goto :goto_9

    .line 24
    :catchall_7
    const-string v0, "\n"

    .line 26
    :goto_9
    sput-object v0, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->SYS_LF:Ljava/lang/String;

    .line 29
    new-instance v1, Lcom/fasterxml/jackson/core/util/DefaultIndenter;

    const-string v2, "  "

    invoke-direct {v1, v2, v0}, Lcom/fasterxml/jackson/core/util/DefaultIndenter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->SYSTEM_LINEFEED_INSTANCE:Lcom/fasterxml/jackson/core/util/DefaultIndenter;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    .line 44
    const-string v0, "  "

    sget-object v1, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->SYS_LF:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/fasterxml/jackson/core/util/DefaultIndenter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 8

    .line 55
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter$NopIndenter;-><init>()V

    .line 56
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->charsPerLevel:I

    .line 58
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    shl-int/lit8 v0, v0, 0x4

    new-array v0, v0, [C

    iput-object v0, p0, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->indents:[C

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_16
    const/16 v3, 0x10

    if-ge v1, v3, :cond_2b

    .line 61
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    iget-object v4, p0, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->indents:[C

    invoke-virtual {p1, v0, v3, v4, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 62
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_16

    .line 65
    :cond_2b
    iput-object p2, p0, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->eol:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public isInline()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public writeIndentation(Lcom/fasterxml/jackson/core/JsonGenerator;I)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->eol:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw(Ljava/lang/String;)V

    if-lez p2, :cond_1c

    .line 92
    iget v0, p0, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->charsPerLevel:I

    mul-int/2addr p2, v0

    .line 93
    :goto_a
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->indents:[C

    array-length v1, v0

    const/4 v2, 0x0

    if-le p2, v1, :cond_19

    .line 94
    array-length v1, v0

    invoke-virtual {p1, v0, v2, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw([CII)V

    .line 95
    iget-object v0, p0, Lcom/fasterxml/jackson/core/util/DefaultIndenter;->indents:[C

    array-length v0, v0

    sub-int/2addr p2, v0

    goto :goto_a

    .line 97
    :cond_19
    invoke-virtual {p1, v0, v2, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw([CII)V

    :cond_1c
    return-void
.end method
