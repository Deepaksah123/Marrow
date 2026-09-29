###### Class com.fasterxml.jackson.core.util.ReadConstrainedTextBuffer (com.fasterxml.jackson.core.util.ReadConstrainedTextBuffer)
.class public final Lcom/fasterxml/jackson/core/util/ReadConstrainedTextBuffer;
.super Lcom/fasterxml/jackson/core/util/TextBuffer;
.source "SourceFile"


# instance fields
.field private final _streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/StreamReadConstraints;Lcom/fasterxml/jackson/core/util/BufferRecycler;)V
    .registers 3

    .line 11
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/core/util/TextBuffer;-><init>(Lcom/fasterxml/jackson/core/util/BufferRecycler;)V

    .line 12
    iput-object p1, p0, Lcom/fasterxml/jackson/core/util/ReadConstrainedTextBuffer;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    return-void
.end method


# virtual methods
.method protected final validateStringLength(I)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/core/exc/StreamConstraintsException;
        }
    .end annotation

    .line 27
    iget-object p0, p0, Lcom/fasterxml/jackson/core/util/ReadConstrainedTextBuffer;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->validateStringLength(I)V

    return-void
.end method
