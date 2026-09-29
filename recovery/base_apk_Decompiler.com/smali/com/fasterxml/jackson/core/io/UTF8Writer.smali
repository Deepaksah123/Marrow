###### Class com.fasterxml.jackson.core.io.UTF8Writer (com.fasterxml.jackson.core.io.UTF8Writer)
.class public final Lcom/fasterxml/jackson/core/io/UTF8Writer;
.super Ljava/io/Writer;
.source "SourceFile"


# instance fields
.field private final _context:Lcom/fasterxml/jackson/core/io/IOContext;

.field private _out:Ljava/io/OutputStream;

.field private _outBuffer:[B

.field private final _outBufferEnd:I

.field private _outPtr:I

.field private _surrogate:I


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/OutputStream;)V
    .registers 3

    .line 30
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    .line 32
    iput-object p2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    .line 34
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/IOContext;->allocWriteEncodingBuffer()[B

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    .line 39
    array-length p1, p1

    add-int/lit8 p1, p1, -0x4

    iput p1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBufferEnd:I

    const/4 p1, 0x0

    .line 40
    iput p1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    return-void
.end method

.method protected static illegalSurrogate(I)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 375
    new-instance v0, Ljava/io/IOException;

    invoke-static {p0}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->illegalSurrogateDesc(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected static illegalSurrogateDesc(I)Ljava/lang/String;
    .registers 4

    const v0, 0x10ffff

    .line 380
    const-string v1, "Illegal character point (0x"

    if-le p0, v0, :cond_1d

    .line 381
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ") to output; max is 0x10FFFF as per RFC 4627"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1d
    const v0, 0xd800

    if-lt p0, v0, :cond_55

    const v0, 0xdbff

    .line 384
    const-string v1, ")"

    if-gt p0, v0, :cond_3f

    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unmatched first part of surrogate pair (0x"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 387
    :cond_3f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unmatched second part of surrogate pair (0x"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 390
    :cond_55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ") to output"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final append(C)Ljava/io/Writer;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(I)V

    return-object p0
.end method

.method public final bridge synthetic append(C)Ljava/lang/Appendable;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    invoke-virtual {p0, p1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    move-result-object p0

    return-object p0
.end method

.method public final close()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    if-eqz v0, :cond_2c

    .line 56
    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    const/4 v2, 0x0

    if-lez v1, :cond_10

    .line 57
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    invoke-virtual {v0, v3, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 58
    iput v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 60
    :cond_10
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    const/4 v1, 0x0

    .line 61
    iput-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    .line 63
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    if-eqz v3, :cond_20

    .line 65
    iput-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    .line 66
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    invoke-virtual {v1, v3}, Lcom/fasterxml/jackson/core/io/IOContext;->releaseWriteEncodingBuffer([B)V

    .line 69
    :cond_20
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 73
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    .line 74
    iput v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    if-lez v0, :cond_2c

    .line 76
    invoke-static {v0}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->illegalSurrogate(I)V

    :cond_2c
    return-void
.end method

.method protected final convertSurrogate(I)I
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 364
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    const/4 v1, 0x0

    .line 365
    iput v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    const p0, 0xdc00

    if-lt p1, p0, :cond_1b

    const v1, 0xdfff

    if-gt p1, v1, :cond_1b

    const v1, 0xd800

    sub-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0xa

    const/high16 v1, 0x10000

    add-int/2addr v0, v1

    sub-int/2addr p1, p0

    add-int/2addr v0, p1

    return v0

    .line 369
    :cond_1b
    new-instance p0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Broken surrogate pair: first char 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", second 0x"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; illegal combination"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final flush()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    if-eqz v0, :cond_15

    .line 86
    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    if-lez v1, :cond_10

    .line 87
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 88
    iput v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 90
    :cond_10
    iget-object p0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V

    :cond_15
    return-void
.end method

.method public final write(I)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 202
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    if-lez v0, :cond_9

    .line 203
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result p1

    goto :goto_1e

    :cond_9
    const v0, 0xd800

    if-lt p1, v0, :cond_1e

    const v0, 0xdfff

    if-gt p1, v0, :cond_1e

    const v0, 0xdbff

    if-le p1, v0, :cond_1b

    .line 208
    invoke-static {p1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->illegalSurrogate(I)V

    .line 211
    :cond_1b
    iput p1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    return-void

    .line 215
    :cond_1e
    :goto_1e
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBufferEnd:I

    if-lt v0, v1, :cond_2e

    .line 216
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 217
    iput v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    :cond_2e
    const/16 v0, 0x80

    if-ge p1, v0, :cond_3e

    .line 221
    iget-object v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    int-to-byte p0, p1

    aput-byte p0, v0, v1

    return-void

    .line 223
    :cond_3e
    iget v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    const/16 v2, 0x800

    if-ge p1, v2, :cond_58

    .line 225
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    shr-int/lit8 v3, p1, 0x6

    or-int/lit16 v3, v3, 0xc0

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    add-int/lit8 v3, v1, 0x2

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v0

    int-to-byte p1, p1

    add-int/lit8 v1, v1, 0x1

    .line 226
    aput-byte p1, v2, v1

    goto :goto_aa

    :cond_58
    const v2, 0xffff

    if-gt p1, v2, :cond_7b

    .line 228
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    shr-int/lit8 v3, p1, 0xc

    or-int/lit16 v3, v3, 0xe0

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    shr-int/lit8 v3, p1, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v0

    int-to-byte v3, v3

    add-int/lit8 v4, v1, 0x1

    .line 229
    aput-byte v3, v2, v4

    add-int/lit8 v3, v1, 0x3

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v0

    int-to-byte p1, p1

    add-int/lit8 v1, v1, 0x2

    .line 230
    aput-byte p1, v2, v1

    goto :goto_aa

    :cond_7b
    const v2, 0x10ffff

    if-le p1, v2, :cond_83

    .line 233
    invoke-static {p1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->illegalSurrogate(I)V

    .line 235
    :cond_83
    iget-object v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    shr-int/lit8 v3, p1, 0x12

    or-int/lit16 v3, v3, 0xf0

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    shr-int/lit8 v3, p1, 0xc

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v0

    int-to-byte v3, v3

    add-int/lit8 v4, v1, 0x1

    .line 236
    aput-byte v3, v2, v4

    shr-int/lit8 v3, p1, 0x6

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v0

    int-to-byte v3, v3

    add-int/lit8 v4, v1, 0x2

    .line 237
    aput-byte v3, v2, v4

    add-int/lit8 v3, v1, 0x4

    and-int/lit8 p1, p1, 0x3f

    or-int/2addr p1, v0

    int-to-byte p1, p1

    add-int/lit8 v1, v1, 0x3

    .line 238
    aput-byte p1, v2, v1

    .line 240
    :goto_aa
    iput v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 247
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    if-ge p3, v0, :cond_e

    const/4 v0, 0x1

    if-ne p3, v0, :cond_d

    .line 255
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(I)V

    :cond_d
    return-void

    .line 261
    :cond_e
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    if-lez v0, :cond_21

    .line 262
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    add-int/lit8 p3, p3, -0x1

    .line 264
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(I)V

    add-int/lit8 p2, p2, 0x1

    .line 268
    :cond_21
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 269
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    .line 270
    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBufferEnd:I

    add-int/2addr p3, p2

    :goto_28
    if-ge p2, p3, :cond_ea

    if-lt v0, v2, :cond_33

    .line 281
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    const/4 v4, 0x0

    invoke-virtual {v3, v1, v4, v0}, Ljava/io/OutputStream;->write([BII)V

    move v0, v4

    :cond_33
    add-int/lit8 v3, p2, 0x1

    .line 285
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v4, 0x80

    if-ge p2, v4, :cond_63

    add-int/lit8 v5, v0, 0x1

    int-to-byte p2, p2

    .line 288
    aput-byte p2, v1, v0

    sub-int p2, p3, v3

    sub-int v0, v2, v5

    if-le p2, v0, :cond_49

    move p2, v0

    :cond_49
    move v0, v3

    :goto_4a
    add-int v6, p2, v3

    if-lt v0, v6, :cond_50

    move p2, v0

    goto :goto_79

    :cond_50
    add-int/lit8 v6, v0, 0x1

    .line 302
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ge v0, v4, :cond_60

    add-int/lit8 v7, v5, 0x1

    int-to-byte v0, v0

    .line 306
    aput-byte v0, v1, v5

    move v0, v6

    move v5, v7

    goto :goto_4a

    :cond_60
    move p2, v0

    move v0, v5

    move v3, v6

    :cond_63
    const/16 v5, 0x800

    if-ge p2, v5, :cond_7b

    shr-int/lit8 v5, p2, 0x6

    or-int/lit16 v5, v5, 0xc0

    int-to-byte v5, v5

    .line 312
    aput-byte v5, v1, v0

    add-int/lit8 v5, v0, 0x2

    and-int/lit8 p2, p2, 0x3f

    or-int/2addr p2, v4

    int-to-byte p2, p2

    add-int/lit8 v0, v0, 0x1

    .line 313
    aput-byte p2, v1, v0

    :goto_78
    move p2, v3

    :goto_79
    move v0, v5

    goto :goto_28

    :cond_7b
    const v5, 0xd800

    if-lt p2, v5, :cond_ce

    const v5, 0xdfff

    if-gt p2, v5, :cond_ce

    const v5, 0xdbff

    if-le p2, v5, :cond_8f

    .line 324
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 325
    invoke-static {p2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->illegalSurrogate(I)V

    .line 327
    :cond_8f
    iput p2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    if-lt v3, p3, :cond_94

    goto :goto_ea

    :cond_94
    add-int/lit8 p2, v3, 0x1

    .line 332
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result v3

    const v5, 0x10ffff

    if-le v3, v5, :cond_a8

    .line 334
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 335
    invoke-static {v3}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->illegalSurrogate(I)V

    :cond_a8
    shr-int/lit8 v5, v3, 0x12

    or-int/lit16 v5, v5, 0xf0

    int-to-byte v5, v5

    .line 337
    aput-byte v5, v1, v0

    shr-int/lit8 v5, v3, 0xc

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v4

    int-to-byte v5, v5

    add-int/lit8 v6, v0, 0x1

    .line 338
    aput-byte v5, v1, v6

    shr-int/lit8 v5, v3, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v4

    int-to-byte v5, v5

    add-int/lit8 v6, v0, 0x2

    .line 339
    aput-byte v5, v1, v6

    add-int/lit8 v5, v0, 0x4

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v4

    int-to-byte v3, v3

    add-int/lit8 v0, v0, 0x3

    .line 340
    aput-byte v3, v1, v0

    goto :goto_79

    :cond_ce
    shr-int/lit8 v5, p2, 0xc

    or-int/lit16 v5, v5, 0xe0

    int-to-byte v5, v5

    .line 317
    aput-byte v5, v1, v0

    shr-int/lit8 v5, p2, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v4

    int-to-byte v5, v5

    add-int/lit8 v6, v0, 0x1

    .line 318
    aput-byte v5, v1, v6

    add-int/lit8 v5, v0, 0x3

    and-int/lit8 p2, p2, 0x3f

    or-int/2addr p2, v4

    int-to-byte p2, p2

    add-int/lit8 v0, v0, 0x2

    .line 319
    aput-byte p2, v1, v0

    goto :goto_78

    .line 343
    :cond_ea
    :goto_ea
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    return-void
.end method

.method public final write([C)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 98
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ljava/io/Writer;->write([CII)V

    return-void
.end method

.method public final write([CII)V
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    if-ge p3, v0, :cond_c

    const/4 v0, 0x1

    if-ne p3, v0, :cond_b

    .line 107
    aget-char p1, p1, p2

    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(I)V

    :cond_b
    return-void

    .line 113
    :cond_c
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    if-lez v0, :cond_1d

    .line 114
    aget-char v0, p1, p2

    add-int/lit8 p3, p3, -0x1

    .line 116
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/io/Writer;->write(I)V

    add-int/lit8 p2, p2, 0x1

    .line 120
    :cond_1d
    iget v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 121
    iget-object v1, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBuffer:[B

    .line 122
    iget v2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outBufferEnd:I

    add-int/2addr p3, p2

    :goto_24
    if-ge p2, p3, :cond_e0

    if-lt v0, v2, :cond_2f

    .line 133
    iget-object v3, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_out:Ljava/io/OutputStream;

    const/4 v4, 0x0

    invoke-virtual {v3, v1, v4, v0}, Ljava/io/OutputStream;->write([BII)V

    move v0, v4

    :cond_2f
    add-int/lit8 v3, p2, 0x1

    .line 137
    aget-char p2, p1, p2

    const/16 v4, 0x80

    if-ge p2, v4, :cond_5b

    add-int/lit8 v5, v0, 0x1

    int-to-byte p2, p2

    .line 140
    aput-byte p2, v1, v0

    sub-int p2, p3, v3

    sub-int v0, v2, v5

    if-le p2, v0, :cond_43

    move p2, v0

    :cond_43
    move v0, v3

    :goto_44
    add-int v6, p2, v3

    if-lt v0, v6, :cond_4a

    move p2, v0

    goto :goto_71

    :cond_4a
    add-int/lit8 v6, v0, 0x1

    .line 154
    aget-char v0, p1, v0

    if-ge v0, v4, :cond_58

    add-int/lit8 v7, v5, 0x1

    int-to-byte v0, v0

    .line 158
    aput-byte v0, v1, v5

    move v0, v6

    move v5, v7

    goto :goto_44

    :cond_58
    move p2, v0

    move v0, v5

    move v3, v6

    :cond_5b
    const/16 v5, 0x800

    if-ge p2, v5, :cond_73

    shr-int/lit8 v5, p2, 0x6

    or-int/lit16 v5, v5, 0xc0

    int-to-byte v5, v5

    .line 164
    aput-byte v5, v1, v0

    add-int/lit8 v5, v0, 0x2

    and-int/lit8 p2, p2, 0x3f

    or-int/2addr p2, v4

    int-to-byte p2, p2

    add-int/lit8 v0, v0, 0x1

    .line 165
    aput-byte p2, v1, v0

    :goto_70
    move p2, v3

    :goto_71
    move v0, v5

    goto :goto_24

    :cond_73
    const v5, 0xd800

    if-lt p2, v5, :cond_c4

    const v5, 0xdfff

    if-gt p2, v5, :cond_c4

    const v5, 0xdbff

    if-le p2, v5, :cond_87

    .line 176
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 177
    invoke-static {p2}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->illegalSurrogate(I)V

    .line 179
    :cond_87
    iput p2, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_surrogate:I

    if-lt v3, p3, :cond_8c

    goto :goto_e0

    :cond_8c
    add-int/lit8 p2, v3, 0x1

    .line 184
    aget-char v3, p1, v3

    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->convertSurrogate(I)I

    move-result v3

    const v5, 0x10ffff

    if-le v3, v5, :cond_9e

    .line 186
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    .line 187
    invoke-static {v3}, Lcom/fasterxml/jackson/core/io/UTF8Writer;->illegalSurrogate(I)V

    :cond_9e
    shr-int/lit8 v5, v3, 0x12

    or-int/lit16 v5, v5, 0xf0

    int-to-byte v5, v5

    .line 189
    aput-byte v5, v1, v0

    shr-int/lit8 v5, v3, 0xc

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v4

    int-to-byte v5, v5

    add-int/lit8 v6, v0, 0x1

    .line 190
    aput-byte v5, v1, v6

    shr-int/lit8 v5, v3, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v4

    int-to-byte v5, v5

    add-int/lit8 v6, v0, 0x2

    .line 191
    aput-byte v5, v1, v6

    add-int/lit8 v5, v0, 0x4

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v4

    int-to-byte v3, v3

    add-int/lit8 v0, v0, 0x3

    .line 192
    aput-byte v3, v1, v0

    goto :goto_71

    :cond_c4
    shr-int/lit8 v5, p2, 0xc

    or-int/lit16 v5, v5, 0xe0

    int-to-byte v5, v5

    .line 169
    aput-byte v5, v1, v0

    shr-int/lit8 v5, p2, 0x6

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v4

    int-to-byte v5, v5

    add-int/lit8 v6, v0, 0x1

    .line 170
    aput-byte v5, v1, v6

    add-int/lit8 v5, v0, 0x3

    and-int/lit8 p2, p2, 0x3f

    or-int/2addr p2, v4

    int-to-byte p2, p2

    add-int/lit8 v0, v0, 0x2

    .line 171
    aput-byte p2, v1, v0

    goto :goto_70

    .line 195
    :cond_e0
    :goto_e0
    iput v0, p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;->_outPtr:I

    return-void
.end method
