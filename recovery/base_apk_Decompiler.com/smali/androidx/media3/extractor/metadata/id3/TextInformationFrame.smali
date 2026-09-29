###### Class androidx.media3.extractor.metadata.id3.TextInformationFrame (androidx.media3.extractor.metadata.id3.TextInformationFrame)
.class public final Landroidx/media3/extractor/metadata/id3/TextInformationFrame;
.super Landroidx/media3/extractor/metadata/id3/Id3Frame;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/id3/TextInformationFrame;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:Lo/initExtraTracks;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/initExtraTracks<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final RemoteActionCompatParcelizer:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 233
    new-instance v0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame$2;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/id3/TextInformationFrame$2;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-static {p1}, Lo/initExtraTracks;->write([Ljava/lang/Object;)Lo/initExtraTracks;

    move-result-object p1

    .line 70
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 35
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 50
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 52
    iput-object p2, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->write:Ljava/lang/String;

    .line 53
    invoke-static {p3}, Lo/initExtraTracks;->write(Ljava/util/Collection;)Lo/initExtraTracks;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    const/4 p2, 0x0

    .line 54
    invoke-virtual {p1, p2}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    return-void
.end method

.method private static write(Ljava/lang/String;)Ljava/util/List;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 252
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 254
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x5

    const/16 v3, 0xa

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v6, 0x4

    if-lt v1, v3, :cond_41

    .line 255
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    invoke-virtual {p0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x8

    .line 257
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    .line 258
    :cond_41
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v4, :cond_66

    .line 259
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    invoke-virtual {p0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    .line 261
    :cond_66
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_7b

    .line 262
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_7b
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_7b} :catch_7c

    :cond_7b
    return-object v0

    .line 266
    :catch_7c
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/getSchema$RemoteActionCompatParcelizer;)V
    .registers 9

    .line 82
    iget-object v0, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    sparse-switch v1, :sswitch_data_266

    goto/16 :goto_116

    :sswitch_13
    const-string v1, "TYER"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0x16

    goto/16 :goto_117

    :sswitch_1f
    const-string v1, "TRCK"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0x15

    goto/16 :goto_117

    :sswitch_2b
    const-string v1, "TPE3"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0x14

    goto/16 :goto_117

    :sswitch_37
    const-string v1, "TPE2"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0x13

    goto/16 :goto_117

    :sswitch_43
    const-string v1, "TPE1"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0x12

    goto/16 :goto_117

    :sswitch_4f
    const-string v1, "TIT2"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0x11

    goto/16 :goto_117

    :sswitch_5b
    const-string v1, "TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0x10

    goto/16 :goto_117

    :sswitch_67
    const-string v1, "TDRL"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0xf

    goto/16 :goto_117

    :sswitch_73
    const-string v1, "TDRC"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0xe

    goto/16 :goto_117

    :sswitch_7f
    const-string v1, "TDAT"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0xd

    goto/16 :goto_117

    :sswitch_8b
    const-string v1, "TCON"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0xc

    goto/16 :goto_117

    :sswitch_97
    const-string v1, "TCOM"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0xb

    goto/16 :goto_117

    :sswitch_a3
    const-string v1, "TALB"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0xa

    goto/16 :goto_117

    :sswitch_af
    const-string v1, "TYE"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0x9

    goto/16 :goto_117

    :sswitch_bb
    const-string v1, "TXT"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/16 v0, 0x8

    goto :goto_117

    :sswitch_c6
    const-string v1, "TT2"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/4 v0, 0x7

    goto :goto_117

    :sswitch_d0
    const-string v1, "TRK"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/4 v0, 0x6

    goto :goto_117

    :sswitch_da
    const-string v1, "TP3"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    const/4 v0, 0x5

    goto :goto_117

    :sswitch_e4
    const-string v1, "TP2"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    move v0, v2

    goto :goto_117

    :sswitch_ee
    const-string v1, "TP1"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    move v0, v3

    goto :goto_117

    :sswitch_f8
    const-string v1, "TDA"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    move v0, v4

    goto :goto_117

    :sswitch_102
    const-string v1, "TCM"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    move v0, v5

    goto :goto_117

    :sswitch_10c
    const-string v1, "TAL"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_116

    move v0, v6

    goto :goto_117

    :cond_116
    :goto_116
    const/4 v0, -0x1

    :goto_117
    packed-switch v0, :pswitch_data_2c4

    return-void

    .line 150
    :pswitch_11b
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->write(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    .line 151
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v5, :cond_143

    if-eq v0, v4, :cond_13a

    if-ne v0, v3, :cond_24d

    .line 153
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lo/getSchema$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;

    .line 156
    :cond_13a
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lo/getSchema$RemoteActionCompatParcelizer;->IconCompatParcelizer(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;

    .line 159
    :cond_143
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 132
    :pswitch_14d
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->write(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    .line 133
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v5, :cond_175

    if-eq v0, v4, :cond_16c

    if-ne v0, v3, :cond_24d

    .line 135
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lo/getSchema$RemoteActionCompatParcelizer;->write(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;

    .line 138
    :cond_16c
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Lo/getSchema$RemoteActionCompatParcelizer;->read(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;

    .line 141
    :cond_175
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 180
    :pswitch_17f
    iget-object v0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {v0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/parseTextAttribute;->RemoteActionCompatParcelizer(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_199

    .line 182
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 185
    :cond_199
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {p0}, Lo/getEnumIds;->write(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_24d

    .line 187
    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 115
    :pswitch_1a7
    :try_start_1a7
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;
    :try_end_1ba
    .catch Ljava/lang/NumberFormatException; {:try_start_1a7 .. :try_end_1ba} :catch_24d

    return-void

    .line 177
    :pswitch_1bb
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 85
    :pswitch_1c7
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 101
    :pswitch_1d3
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const-string v0, "/"

    invoke-static {p0, v0}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 103
    :try_start_1e1
    aget-object v0, p0, v6

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 106
    array-length v1, p0

    if-le v1, v5, :cond_1f5

    aget-object p0, p0, v5

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_1f6

    :cond_1f5
    const/4 p0, 0x0

    .line 107
    :goto_1f6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;

    move-result-object p1

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;
    :try_end_201
    .catch Ljava/lang/NumberFormatException; {:try_start_1e1 .. :try_end_201} :catch_24d

    return-void

    .line 173
    :pswitch_202
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 93
    :pswitch_20e
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->write(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 89
    :pswitch_21a
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 123
    :pswitch_226
    :try_start_226
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 124
    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 125
    invoke-virtual {p0, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    .line 126
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/getSchema$RemoteActionCompatParcelizer;->read(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->write(Ljava/lang/Integer;)Lo/getSchema$RemoteActionCompatParcelizer;
    :try_end_24d
    .catch Ljava/lang/NumberFormatException; {:try_start_226 .. :try_end_24d} :catch_24d
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_226 .. :try_end_24d} :catch_24d

    :catch_24d
    :cond_24d
    return-void

    .line 169
    :pswitch_24e
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->read(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    .line 97
    :pswitch_25a
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0, v6}, Lo/initExtraTracks;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->IconCompatParcelizer(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void

    :sswitch_data_266
    .sparse-switch
        0x1437f -> :sswitch_10c
        0x143be -> :sswitch_102
        0x143d1 -> :sswitch_f8
        0x14535 -> :sswitch_ee
        0x14536 -> :sswitch_e4
        0x14537 -> :sswitch_da
        0x1458d -> :sswitch_d0
        0x145b2 -> :sswitch_c6
        0x14650 -> :sswitch_bb
        0x14660 -> :sswitch_af
        0x272ca3 -> :sswitch_a3
        0x27348d -> :sswitch_97
        0x27348e -> :sswitch_8b
        0x2736a3 -> :sswitch_7f
        0x2738a1 -> :sswitch_73
        0x2738aa -> :sswitch_67
        0x273d2d -> :sswitch_5b
        0x274b93 -> :sswitch_4f
        0x276408 -> :sswitch_43
        0x276409 -> :sswitch_37
        0x27640a -> :sswitch_2b
        0x276b66 -> :sswitch_1f
        0x2785f2 -> :sswitch_13
    .end sparse-switch

    :pswitch_data_2c4
    .packed-switch 0x0
        :pswitch_25a
        :pswitch_24e
        :pswitch_226
        :pswitch_21a
        :pswitch_20e
        :pswitch_202
        :pswitch_1d3
        :pswitch_1c7
        :pswitch_1bb
        :pswitch_1a7
        :pswitch_25a
        :pswitch_24e
        :pswitch_17f
        :pswitch_226
        :pswitch_14d
        :pswitch_11b
        :pswitch_1bb
        :pswitch_1c7
        :pswitch_21a
        :pswitch_20e
        :pswitch_202
        :pswitch_1d3
        :pswitch_1a7
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_31

    .line 201
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_31

    .line 204
    check-cast p1, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;

    .line 205
    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->write:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->write:Ljava/lang/String;

    .line 206
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    iget-object p1, p1, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    .line 207
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_31

    return v0

    :cond_31
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 3

    .line 213
    iget-object v0, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 214
    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->write:Ljava/lang/String;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_10

    :cond_f
    const/4 v1, 0x0

    :goto_10
    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 215
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->write:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": values="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 228
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 229
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 230
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;->AudioAttributesCompatParcelizer:Lo/initExtraTracks;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.id3.TextInformationFrame.AnonymousClass2 (androidx.media3.extractor.metadata.id3.TextInformationFrame$2)
.class final Landroidx/media3/extractor/metadata/id3/TextInformationFrame$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/id3/TextInformationFrame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/id3/TextInformationFrame;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static read(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/TextInformationFrame;
    .registers 3

    .line 238
    new-instance v0, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/media3/extractor/metadata/id3/TextInformationFrame;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method

.method private static write(I)[Landroidx/media3/extractor/metadata/id3/TextInformationFrame;
    .registers 1

    .line 243
    new-array p0, p0, [Landroidx/media3/extractor/metadata/id3/TextInformationFrame;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 234
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/TextInformationFrame$2;->read(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/TextInformationFrame;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 234
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/TextInformationFrame$2;->write(I)[Landroidx/media3/extractor/metadata/id3/TextInformationFrame;

    move-result-object p0

    return-object p0
.end method
