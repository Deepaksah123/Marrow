###### Class com.fasterxml.jackson.core.JsonFactory (com.fasterxml.jackson.core.JsonFactory)
.class public Lcom/fasterxml/jackson/core/JsonFactory;
.super Lcom/fasterxml/jackson/core/TokenStreamFactory;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/core/JsonFactory$Feature;
    }
.end annotation


# static fields
.field protected static final DEFAULT_FACTORY_FEATURE_FLAGS:I

.field protected static final DEFAULT_GENERATOR_FEATURE_FLAGS:I

.field protected static final DEFAULT_PARSER_FEATURE_FLAGS:I

.field public static final DEFAULT_ROOT_VALUE_SEPARATOR:Lcom/fasterxml/jackson/core/SerializableString;


# instance fields
.field protected final transient _byteSymbolCanonicalizer:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

.field protected _characterEscapes:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

.field protected _factoryFeatures:I

.field protected _generatorFeatures:I

.field protected _inputDecorator:Lcom/fasterxml/jackson/core/io/InputDecorator;

.field protected _maximumNonEscapedChar:I

.field public _objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

.field protected _outputDecorator:Lcom/fasterxml/jackson/core/io/OutputDecorator;

.field protected _parserFeatures:I

.field protected final _quoteChar:C

.field protected final transient _rootCharSymbols:Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

.field protected _rootValueSeparator:Lcom/fasterxml/jackson/core/SerializableString;

.field protected _streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 186
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->collectDefaults()I

    move-result v0

    sput v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_FACTORY_FEATURE_FLAGS:I

    .line 192
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonParser$Feature;->collectDefaults()I

    move-result v0

    sput v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_PARSER_FEATURE_FLAGS:I

    .line 198
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonGenerator$Feature;->collectDefaults()I

    move-result v0

    sput v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_GENERATOR_FEATURE_FLAGS:I

    .line 200
    sget-object v0, Lcom/fasterxml/jackson/core/util/DefaultPrettyPrinter;->DEFAULT_ROOT_VALUE_SEPARATOR:Lcom/fasterxml/jackson/core/io/SerializedString;

    sput-object v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_ROOT_VALUE_SEPARATOR:Lcom/fasterxml/jackson/core/SerializableString;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 336
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>(Lcom/fasterxml/jackson/core/ObjectCodec;)V

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/core/JsonFactory;Lcom/fasterxml/jackson/core/ObjectCodec;)V
    .registers 4

    .line 353
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/TokenStreamFactory;-><init>()V

    .line 218
    invoke-static {}, Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;->createRoot()Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootCharSymbols:Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    .line 229
    invoke-static {}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->createRoot()Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_byteSymbolCanonicalizer:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    .line 240
    sget v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_FACTORY_FEATURE_FLAGS:I

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    .line 245
    sget v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_PARSER_FEATURE_FLAGS:I

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_parserFeatures:I

    .line 250
    sget v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_GENERATOR_FEATURE_FLAGS:I

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_generatorFeatures:I

    .line 301
    sget-object v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_ROOT_VALUE_SEPARATOR:Lcom/fasterxml/jackson/core/SerializableString;

    iput-object v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootValueSeparator:Lcom/fasterxml/jackson/core/SerializableString;

    .line 354
    iput-object p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    .line 357
    iget p2, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    iput p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    .line 358
    iget p2, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_parserFeatures:I

    iput p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_parserFeatures:I

    .line 359
    iget p2, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_generatorFeatures:I

    iput p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_generatorFeatures:I

    .line 360
    iget-object p2, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_inputDecorator:Lcom/fasterxml/jackson/core/io/InputDecorator;

    iput-object p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_inputDecorator:Lcom/fasterxml/jackson/core/io/InputDecorator;

    .line 361
    iget-object p2, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_outputDecorator:Lcom/fasterxml/jackson/core/io/OutputDecorator;

    iput-object p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_outputDecorator:Lcom/fasterxml/jackson/core/io/OutputDecorator;

    .line 362
    iget-object p2, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    if-nez p2, :cond_3d

    .line 363
    invoke-static {}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->defaults()Lcom/fasterxml/jackson/core/StreamReadConstraints;

    move-result-object p2

    :cond_3d
    iput-object p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    .line 366
    iget-object p2, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_characterEscapes:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    iput-object p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_characterEscapes:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    .line 367
    iget-object p2, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_rootValueSeparator:Lcom/fasterxml/jackson/core/SerializableString;

    iput-object p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootValueSeparator:Lcom/fasterxml/jackson/core/SerializableString;

    .line 368
    iget p2, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_maximumNonEscapedChar:I

    iput p2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_maximumNonEscapedChar:I

    .line 369
    iget-char p1, p1, Lcom/fasterxml/jackson/core/JsonFactory;->_quoteChar:C

    iput-char p1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_quoteChar:C

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/ObjectCodec;)V
    .registers 3

    .line 338
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/TokenStreamFactory;-><init>()V

    .line 218
    invoke-static {}, Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;->createRoot()Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootCharSymbols:Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    .line 229
    invoke-static {}, Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;->createRoot()Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_byteSymbolCanonicalizer:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    .line 240
    sget v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_FACTORY_FEATURE_FLAGS:I

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    .line 245
    sget v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_PARSER_FEATURE_FLAGS:I

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_parserFeatures:I

    .line 250
    sget v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_GENERATOR_FEATURE_FLAGS:I

    iput v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_generatorFeatures:I

    .line 301
    sget-object v0, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_ROOT_VALUE_SEPARATOR:Lcom/fasterxml/jackson/core/SerializableString;

    iput-object v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootValueSeparator:Lcom/fasterxml/jackson/core/SerializableString;

    .line 339
    iput-object p1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    const/16 p1, 0x22

    .line 340
    iput-char p1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_quoteChar:C

    .line 341
    invoke-static {}, Lcom/fasterxml/jackson/core/StreamReadConstraints;->defaults()Lcom/fasterxml/jackson/core/StreamReadConstraints;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    return-void
.end method


# virtual methods
.method protected _createContentReference(Ljava/lang/Object;)Lcom/fasterxml/jackson/core/io/ContentReference;
    .registers 2

    .line 2090
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonFactory;->canHandleBinaryNatively()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-static {p0, p1}, Lcom/fasterxml/jackson/core/io/ContentReference;->construct(ZLjava/lang/Object;)Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object p0

    return-object p0
.end method

.method protected _createContentReference(Ljava/lang/Object;II)Lcom/fasterxml/jackson/core/io/ContentReference;
    .registers 4

    .line 2113
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonFactory;->canHandleBinaryNatively()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-static {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/io/ContentReference;->construct(ZLjava/lang/Object;II)Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object p0

    return-object p0
.end method

.method protected _createContext(Lcom/fasterxml/jackson/core/io/ContentReference;Z)Lcom/fasterxml/jackson/core/io/IOContext;
    .registers 5

    if-nez p1, :cond_6

    .line 2035
    invoke-static {}, Lcom/fasterxml/jackson/core/io/ContentReference;->unknown()Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object p1

    .line 2037
    :cond_6
    new-instance v0, Lcom/fasterxml/jackson/core/io/IOContext;

    iget-object v1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_streamReadConstraints:Lcom/fasterxml/jackson/core/StreamReadConstraints;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonFactory;->_getBufferRecycler()Lcom/fasterxml/jackson/core/util/BufferRecycler;

    move-result-object p0

    invoke-direct {v0, v1, p0, p1, p2}, Lcom/fasterxml/jackson/core/io/IOContext;-><init>(Lcom/fasterxml/jackson/core/StreamReadConstraints;Lcom/fasterxml/jackson/core/util/BufferRecycler;Lcom/fasterxml/jackson/core/io/ContentReference;Z)V

    return-object v0
.end method

.method protected _createGenerator(Ljava/io/Writer;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1883
    new-instance v6, Lcom/fasterxml/jackson/core/json/WriterBasedJsonGenerator;

    iget v2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_generatorFeatures:I

    iget-object v3, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    iget-char v5, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_quoteChar:C

    move-object v0, v6

    move-object v1, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/core/json/WriterBasedJsonGenerator;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;ILcom/fasterxml/jackson/core/ObjectCodec;Ljava/io/Writer;C)V

    .line 1885
    iget p1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_maximumNonEscapedChar:I

    if-lez p1, :cond_15

    .line 1886
    invoke-virtual {v6, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->setHighestNonEscapedChar(I)Lcom/fasterxml/jackson/core/JsonGenerator;

    .line 1888
    :cond_15
    iget-object p1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_characterEscapes:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    if-eqz p1, :cond_1c

    .line 1889
    invoke-virtual {v6, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->setCharacterEscapes(Lcom/fasterxml/jackson/core/io/CharacterEscapes;)Lcom/fasterxml/jackson/core/JsonGenerator;

    .line 1891
    :cond_1c
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootValueSeparator:Lcom/fasterxml/jackson/core/SerializableString;

    .line 1892
    sget-object p1, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_ROOT_VALUE_SEPARATOR:Lcom/fasterxml/jackson/core/SerializableString;

    if-eq p0, p1, :cond_25

    .line 1893
    invoke-virtual {v6, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->setRootValueSeparator(Lcom/fasterxml/jackson/core/SerializableString;)Lcom/fasterxml/jackson/core/JsonGenerator;

    :cond_25
    return-object v6
.end method

.method protected _createParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1744
    :try_start_0
    new-instance v0, Lcom/fasterxml/jackson/core/json/ByteSourceJsonBootstrapper;

    invoke-direct {v0, p2, p1}, Lcom/fasterxml/jackson/core/json/ByteSourceJsonBootstrapper;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/InputStream;)V

    iget v1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_parserFeatures:I

    iget-object v2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    iget-object v3, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_byteSymbolCanonicalizer:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    iget-object v4, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootCharSymbols:Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    iget v5, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/core/json/ByteSourceJsonBootstrapper;->constructParser(ILcom/fasterxml/jackson/core/ObjectCodec;Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;I)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_13} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_13} :catch_14

    return-object p0

    :catch_14
    move-exception p0

    .line 1748
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/io/IOContext;->isResourceManaged()Z

    move-result p2

    if-eqz p2, :cond_23

    .line 1750
    :try_start_1b
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1e} :catch_1f

    goto :goto_23

    :catch_1f
    move-exception p1

    .line 1752
    invoke-virtual {p0, p1}, Ljava/lang/Exception;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1755
    :cond_23
    :goto_23
    throw p0
.end method

.method protected _createParser(Ljava/io/Reader;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1779
    iget v2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_parserFeatures:I

    iget-object v4, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootCharSymbols:Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    iget p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    .line 1780
    new-instance v6, Lcom/fasterxml/jackson/core/json/ReaderBasedJsonParser;

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;->makeChild(I)Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    move-result-object v5

    move-object v0, v6

    move-object v1, p2

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/core/json/ReaderBasedJsonParser;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;ILjava/io/Reader;Lcom/fasterxml/jackson/core/ObjectCodec;Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;)V

    return-object v6
.end method

.method protected _createParser([BIILcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1828
    new-instance v0, Lcom/fasterxml/jackson/core/json/ByteSourceJsonBootstrapper;

    invoke-direct {v0, p4, p1, p2, p3}, Lcom/fasterxml/jackson/core/json/ByteSourceJsonBootstrapper;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;[BII)V

    iget v1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_parserFeatures:I

    iget-object v2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    iget-object v3, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_byteSymbolCanonicalizer:Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;

    iget-object v4, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootCharSymbols:Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    iget v5, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/core/json/ByteSourceJsonBootstrapper;->constructParser(ILcom/fasterxml/jackson/core/ObjectCodec;Lcom/fasterxml/jackson/core/sym/ByteQuadsCanonicalizer;Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;I)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0
.end method

.method protected _createParser([CIILcom/fasterxml/jackson/core/io/IOContext;Z)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p0

    .line 1801
    iget v2, v0, Lcom/fasterxml/jackson/core/JsonFactory;->_parserFeatures:I

    iget-object v4, v0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    iget-object v1, v0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootCharSymbols:Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    iget v0, v0, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    .line 1802
    new-instance v10, Lcom/fasterxml/jackson/core/json/ReaderBasedJsonParser;

    const/4 v3, 0x0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;->makeChild(I)Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;

    move-result-object v5

    add-int v8, p2, p3

    move-object v0, v10

    move-object v1, p4

    move-object v6, p1

    move v7, p2

    move/from16 v9, p5

    invoke-direct/range {v0 .. v9}, Lcom/fasterxml/jackson/core/json/ReaderBasedJsonParser;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;ILjava/io/Reader;Lcom/fasterxml/jackson/core/ObjectCodec;Lcom/fasterxml/jackson/core/sym/CharsToNameCanonicalizer;[CIIZ)V

    return-object v10
.end method

.method protected _createUTF8Generator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1916
    new-instance v6, Lcom/fasterxml/jackson/core/json/UTF8JsonGenerator;

    iget v2, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_generatorFeatures:I

    iget-object v3, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    iget-char v5, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_quoteChar:C

    move-object v0, v6

    move-object v1, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/core/json/UTF8JsonGenerator;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;ILcom/fasterxml/jackson/core/ObjectCodec;Ljava/io/OutputStream;C)V

    .line 1918
    iget p1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_maximumNonEscapedChar:I

    if-lez p1, :cond_15

    .line 1919
    invoke-virtual {v6, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->setHighestNonEscapedChar(I)Lcom/fasterxml/jackson/core/JsonGenerator;

    .line 1921
    :cond_15
    iget-object p1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_characterEscapes:Lcom/fasterxml/jackson/core/io/CharacterEscapes;

    if-eqz p1, :cond_1c

    .line 1922
    invoke-virtual {v6, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->setCharacterEscapes(Lcom/fasterxml/jackson/core/io/CharacterEscapes;)Lcom/fasterxml/jackson/core/JsonGenerator;

    .line 1924
    :cond_1c
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_rootValueSeparator:Lcom/fasterxml/jackson/core/SerializableString;

    .line 1925
    sget-object p1, Lcom/fasterxml/jackson/core/JsonFactory;->DEFAULT_ROOT_VALUE_SEPARATOR:Lcom/fasterxml/jackson/core/SerializableString;

    if-eq p0, p1, :cond_25

    .line 1926
    invoke-virtual {v6, p0}, Lcom/fasterxml/jackson/core/JsonGenerator;->setRootValueSeparator(Lcom/fasterxml/jackson/core/SerializableString;)Lcom/fasterxml/jackson/core/JsonGenerator;

    :cond_25
    return-object v6
.end method

.method protected _createWriter(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/Writer;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1934
    sget-object p0, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    if-ne p2, p0, :cond_a

    .line 1935
    new-instance p0, Lcom/fasterxml/jackson/core/io/UTF8Writer;

    invoke-direct {p0, p3, p1}, Lcom/fasterxml/jackson/core/io/UTF8Writer;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/OutputStream;)V

    return-object p0

    .line 1938
    :cond_a
    new-instance p0, Ljava/io/OutputStreamWriter;

    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonEncoding;->getJavaName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    return-object p0
.end method

.method protected final _decorate(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/InputStream;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1948
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_inputDecorator:Lcom/fasterxml/jackson/core/io/InputDecorator;

    if-eqz p0, :cond_b

    .line 1949
    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/core/io/InputDecorator;->decorate(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p0

    if-eqz p0, :cond_b

    return-object p0

    :cond_b
    return-object p1
.end method

.method protected final _decorate(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/OutputStream;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1979
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_outputDecorator:Lcom/fasterxml/jackson/core/io/OutputDecorator;

    if-eqz p0, :cond_b

    .line 1980
    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/core/io/OutputDecorator;->decorate(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/OutputStream;)Ljava/io/OutputStream;

    move-result-object p0

    if-eqz p0, :cond_b

    return-object p0

    :cond_b
    return-object p1
.end method

.method protected final _decorate(Ljava/io/Reader;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/Reader;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1958
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_inputDecorator:Lcom/fasterxml/jackson/core/io/InputDecorator;

    if-eqz p0, :cond_b

    .line 1959
    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/core/io/InputDecorator;->decorate(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/Reader;)Ljava/io/Reader;

    move-result-object p0

    if-eqz p0, :cond_b

    return-object p0

    :cond_b
    return-object p1
.end method

.method protected final _decorate(Ljava/io/Writer;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/Writer;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1989
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_outputDecorator:Lcom/fasterxml/jackson/core/io/OutputDecorator;

    if-eqz p0, :cond_b

    .line 1990
    invoke-virtual {p0, p2, p1}, Lcom/fasterxml/jackson/core/io/OutputDecorator;->decorate(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/Writer;)Ljava/io/Writer;

    move-result-object p0

    if-eqz p0, :cond_b

    return-object p0

    :cond_b
    return-object p1
.end method

.method public _getBufferRecycler()Lcom/fasterxml/jackson/core/util/BufferRecycler;
    .registers 2

    .line 2017
    sget-object v0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    iget p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_factoryFeatures:I

    invoke-virtual {v0, p0}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->enabledIn(I)Z

    move-result p0

    if-eqz p0, :cond_f

    .line 2018
    invoke-static {}, Lcom/fasterxml/jackson/core/util/BufferRecyclers;->getBufferRecycler()Lcom/fasterxml/jackson/core/util/BufferRecycler;

    move-result-object p0

    return-object p0

    .line 2020
    :cond_f
    new-instance p0, Lcom/fasterxml/jackson/core/util/BufferRecycler;

    invoke-direct {p0}, Lcom/fasterxml/jackson/core/util/BufferRecycler;-><init>()V

    return-object p0
.end method

.method public canHandleBinaryNatively()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public canUseCharArrays()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public createGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1366
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContentReference(Ljava/lang/Object;)Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContext(Lcom/fasterxml/jackson/core/io/ContentReference;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    .line 1367
    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/core/io/IOContext;->setEncoding(Lcom/fasterxml/jackson/core/JsonEncoding;)V

    .line 1368
    sget-object v1, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    if-ne p2, v1, :cond_19

    .line 1369
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_decorate(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/OutputStream;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createUTF8Generator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p0

    return-object p0

    .line 1371
    :cond_19
    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createWriter(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/Writer;

    move-result-object p1

    .line 1372
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_decorate(Ljava/io/Writer;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/Writer;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createGenerator(Ljava/io/Writer;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p0

    return-object p0
.end method

.method public createGenerator(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1405
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContentReference(Ljava/lang/Object;)Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContext(Lcom/fasterxml/jackson/core/io/ContentReference;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    .line 1406
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_decorate(Ljava/io/Writer;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/Writer;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createGenerator(Ljava/io/Writer;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p0

    return-object p0
.end method

.method public createParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1142
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContentReference(Ljava/lang/Object;)Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContext(Lcom/fasterxml/jackson/core/io/ContentReference;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    .line 1143
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_decorate(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0
.end method

.method public createParser(Ljava/io/Reader;)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1163
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContentReference(Ljava/lang/Object;)Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContext(Lcom/fasterxml/jackson/core/io/ContentReference;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    .line 1164
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_decorate(Ljava/io/Reader;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/Reader;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createParser(Ljava/io/Reader;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0
.end method

.method public createParser(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1217
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 1219
    iget-object v0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_inputDecorator:Lcom/fasterxml/jackson/core/io/InputDecorator;

    if-nez v0, :cond_2c

    const v0, 0x8000

    if-gt v3, v0, :cond_2c

    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonFactory;->canUseCharArrays()Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 1224
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContentReference(Ljava/lang/Object;)Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContext(Lcom/fasterxml/jackson/core/io/ContentReference;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v4

    .line 1225
    invoke-virtual {v4, v3}, Lcom/fasterxml/jackson/core/io/IOContext;->allocTokenBuffer(I)[C

    move-result-object v1

    const/4 v0, 0x0

    .line 1226
    invoke-virtual {p1, v0, v3, v1, v0}, Ljava/lang/String;->getChars(II[CI)V

    const/4 v2, 0x0

    const/4 v5, 0x1

    move-object v0, p0

    .line 1227
    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/core/JsonFactory;->_createParser([CIILcom/fasterxml/jackson/core/io/IOContext;Z)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0

    .line 1222
    :cond_2c
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->createParser(Ljava/io/Reader;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0
.end method

.method public createParser([B)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1175
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContentReference(Ljava/lang/Object;)Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContext(Lcom/fasterxml/jackson/core/io/ContentReference;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    .line 1176
    iget-object v1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_inputDecorator:Lcom/fasterxml/jackson/core/io/InputDecorator;

    const/4 v2, 0x0

    if-eqz v1, :cond_1a

    .line 1177
    array-length v3, p1

    invoke-virtual {v1, v0, p1, v2, v3}, Lcom/fasterxml/jackson/core/io/InputDecorator;->decorate(Lcom/fasterxml/jackson/core/io/IOContext;[BII)Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_1a

    .line 1179
    invoke-virtual {p0, v1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0

    .line 1182
    :cond_1a
    array-length v1, p1

    invoke-virtual {p0, p1, v2, v1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createParser([BIILcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0
.end method

.method public createParser([BII)Lcom/fasterxml/jackson/core/JsonParser;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/fasterxml/jackson/core/JsonParseException;
        }
    .end annotation

    .line 1197
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonFactory;->_checkRangeBoundsForByteArray([BII)V

    .line 1198
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContentReference(Ljava/lang/Object;II)Lcom/fasterxml/jackson/core/io/ContentReference;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->_createContext(Lcom/fasterxml/jackson/core/io/ContentReference;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    .line 1200
    iget-object v1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_inputDecorator:Lcom/fasterxml/jackson/core/io/InputDecorator;

    if-eqz v1, :cond_1b

    .line 1201
    invoke-virtual {v1, v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/io/InputDecorator;->decorate(Lcom/fasterxml/jackson/core/io/IOContext;[BII)Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_1b

    .line 1203
    invoke-virtual {p0, v1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0

    .line 1206
    :cond_1b
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->_createParser([BIILcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p0

    return-object p0
.end method

.method public getCodec()Lcom/fasterxml/jackson/core/ObjectCodec;
    .registers 1

    .line 1057
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    return-object p0
.end method

.method public getFormatName()Ljava/lang/String;
    .registers 2

    .line 637
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Lcom/fasterxml/jackson/core/JsonFactory;

    if-ne p0, v0, :cond_b

    .line 638
    const-string p0, "JSON"

    return-object p0

    :cond_b
    const/4 p0, 0x0

    return-object p0
.end method

.method public hasFormat(Lcom/fasterxml/jackson/core/format/InputAccessor;)Lcom/fasterxml/jackson/core/format/MatchStrength;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 646
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/fasterxml/jackson/core/JsonFactory;

    if-ne v0, v1, :cond_d

    .line 647
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->hasJSONFormat(Lcom/fasterxml/jackson/core/format/InputAccessor;)Lcom/fasterxml/jackson/core/format/MatchStrength;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0
.end method

.method protected hasJSONFormat(Lcom/fasterxml/jackson/core/format/InputAccessor;)Lcom/fasterxml/jackson/core/format/MatchStrength;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 670
    invoke-static {p1}, Lcom/fasterxml/jackson/core/json/ByteSourceJsonBootstrapper;->hasJSONFormat(Lcom/fasterxml/jackson/core/format/InputAccessor;)Lcom/fasterxml/jackson/core/format/MatchStrength;

    move-result-object p0

    return-object p0
.end method

.method protected readResolve()Ljava/lang/Object;
    .registers 3

    .line 500
    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory;

    iget-object v1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    invoke-direct {v0, p0, v1}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>(Lcom/fasterxml/jackson/core/JsonFactory;Lcom/fasterxml/jackson/core/ObjectCodec;)V

    return-object v0
.end method

.method public requiresPropertyOrdering()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public setCodec(Lcom/fasterxml/jackson/core/ObjectCodec;)Lcom/fasterxml/jackson/core/JsonFactory;
    .registers 2

    .line 1053
    iput-object p1, p0, Lcom/fasterxml/jackson/core/JsonFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    return-object p0
.end method

###### Class com.fasterxml.jackson.core.JsonFactory.Feature (com.fasterxml.jackson.core.JsonFactory$Feature)
.class public final enum Lcom/fasterxml/jackson/core/JsonFactory$Feature;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/fasterxml/jackson/core/util/JacksonFeature;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/core/JsonFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Feature"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/core/JsonFactory$Feature;",
        ">;",
        "Lcom/fasterxml/jackson/core/util/JacksonFeature;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/core/JsonFactory$Feature;

.field public static final enum CANONICALIZE_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

.field public static final enum CHARSET_DETECTION:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

.field public static final enum FAIL_ON_SYMBOL_HASH_OVERFLOW:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

.field public static final enum INTERN_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

.field public static final enum USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING:Lcom/fasterxml/jackson/core/JsonFactory$Feature;


# instance fields
.field private final _defaultState:Z


# direct methods
.method static constructor <clinit>()V
    .registers 8

    .line 83
    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    const-string v1, "INTERN_FIELD_NAMES"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->INTERN_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 93
    new-instance v1, Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    const-string v2, "CANONICALIZE_FIELD_NAMES"

    invoke-direct {v1, v2, v3, v3}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->CANONICALIZE_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 109
    new-instance v2, Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    const-string v4, "FAIL_ON_SYMBOL_HASH_OVERFLOW"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v2, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->FAIL_ON_SYMBOL_HASH_OVERFLOW:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 126
    new-instance v4, Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    const-string v5, "USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING"

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6, v3}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v4, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 138
    new-instance v5, Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    const-string v6, "CHARSET_DETECTION"

    const/4 v7, 0x4

    invoke-direct {v5, v6, v7, v3}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v5, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->CHARSET_DETECTION:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 63
    filled-new-array {v0, v1, v2, v4, v5}, [Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->$VALUES:[Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 161
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->_defaultState:Z

    return-void
.end method

.method public static collectDefaults()I
    .registers 6

    .line 155
    invoke-static {}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->values()[Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_7
    if-ge v2, v1, :cond_19

    aget-object v4, v0, v2

    .line 156
    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->enabledByDefault()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-virtual {v4}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->getMask()I

    move-result v4

    or-int/2addr v3, v4

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_19
    return v3
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonFactory$Feature;
    .registers 2

    .line 63
    const-class v0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/core/JsonFactory$Feature;
    .registers 1

    .line 63
    sget-object v0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->$VALUES:[Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/core/JsonFactory$Feature;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    return-object v0
.end method


# virtual methods
.method public final enabledByDefault()Z
    .registers 1

    .line 164
    iget-boolean p0, p0, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->_defaultState:Z

    return p0
.end method

.method public final enabledIn(I)Z
    .registers 2

    .line 166
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->getMask()I

    move-result p0

    and-int/2addr p0, p1

    if-eqz p0, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public final getMask()I
    .registers 2

    const/4 v0, 0x1

    .line 168
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    shl-int p0, v0, p0

    return p0
.end method
