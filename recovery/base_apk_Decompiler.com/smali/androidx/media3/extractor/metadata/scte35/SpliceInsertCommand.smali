###### Class androidx.media3.extractor.metadata.scte35.SpliceInsertCommand (androidx.media3.extractor.metadata.scte35.SpliceInsertCommand)
.class public final Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;
.super Landroidx/media3/extractor/metadata/scte35/SpliceCommand;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field public final AudioAttributesImplApi21Parcelizer:Z

.field public final AudioAttributesImplApi26Parcelizer:J

.field public final AudioAttributesImplBaseParcelizer:Z

.field public final IconCompatParcelizer:J

.field public final MediaBrowserCompatCustomActionResultReceiver:Z

.field public final MediaBrowserCompatItemReceiver:J

.field public final MediaBrowserCompatSearchResultReceiver:J

.field public final MediaDescriptionCompat:I

.field public final MediaMetadataCompat:Z

.field public final RemoteActionCompatParcelizer:I

.field public final read:Z

.field public final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 266
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$4;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$4;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(JZZZZJJLjava/util/List;ZJIII)V
    .registers 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZZZJJ",
            "Ljava/util/List<",
            "Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;",
            ">;ZJIII)V"
        }
    .end annotation

    move-object v0, p0

    .line 106
    invoke-direct {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceCommand;-><init>()V

    move-wide v1, p1

    .line 107
    iput-wide v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatSearchResultReceiver:J

    move v1, p3

    .line 108
    iput-boolean v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplBaseParcelizer:Z

    move v1, p4

    .line 109
    iput-boolean v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplApi21Parcelizer:Z

    move v1, p5

    .line 110
    iput-boolean v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatCustomActionResultReceiver:Z

    move v1, p6

    .line 111
    iput-boolean v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaMetadataCompat:Z

    move-wide v1, p7

    .line 112
    iput-wide v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplApi26Parcelizer:J

    move-wide v1, p9

    .line 113
    iput-wide v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatItemReceiver:J

    .line 114
    invoke-static {p11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesCompatParcelizer:Ljava/util/List;

    move v1, p12

    .line 115
    iput-boolean v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->read:Z

    move-wide/from16 v1, p13

    .line 116
    iput-wide v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->IconCompatParcelizer:J

    move/from16 v1, p15

    .line 117
    iput v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaDescriptionCompat:I

    move/from16 v1, p16

    .line 118
    iput v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->write:I

    move/from16 v1, p17

    .line 119
    iput v1, v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 8

    .line 122
    invoke-direct {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceCommand;-><init>()V

    .line 123
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatSearchResultReceiver:J

    .line 124
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_13

    move v0, v2

    goto :goto_14

    :cond_13
    move v0, v1

    :goto_14
    iput-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplBaseParcelizer:Z

    .line 125
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_1e

    move v0, v2

    goto :goto_1f

    :cond_1e
    move v0, v1

    :goto_1f
    iput-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplApi21Parcelizer:Z

    .line 126
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_29

    move v0, v2

    goto :goto_2a

    :cond_29
    move v0, v1

    :goto_2a
    iput-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_34

    move v0, v2

    goto :goto_35

    :cond_34
    move v0, v1

    :goto_35
    iput-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaMetadataCompat:Z

    .line 128
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplApi26Parcelizer:J

    .line 129
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatItemReceiver:J

    .line 130
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 131
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v1

    :goto_4d
    if-ge v4, v0, :cond_59

    .line 133
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;->write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4d

    .line 135
    :cond_59
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesCompatParcelizer:Ljava/util/List;

    .line 136
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_66

    move v1, v2

    :cond_66
    iput-boolean v1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->read:Z

    .line 137
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->IconCompatParcelizer:J

    .line 138
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaDescriptionCompat:I

    .line 139
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->write:I

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 30
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static IconCompatParcelizer(Lo/AsPropertyTypeDeserializer;JLo/MinimalClassNameIdResolver;)Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;
    .registers 31

    move-object/from16 v0, p3

    .line 145
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onMediaButtonEvent()J

    move-result-wide v2

    .line 147
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v1

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_10

    const/4 v6, 0x1

    goto :goto_11

    :cond_10
    const/4 v6, 0x0

    .line 152
    :goto_11
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    if-nez v6, :cond_ca

    .line 159
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v9

    and-int/lit16 v10, v9, 0x80

    if-eqz v10, :cond_21

    const/4 v10, 0x1

    goto :goto_22

    :cond_21
    const/4 v10, 0x0

    :goto_22
    and-int/lit8 v11, v9, 0x40

    if-eqz v11, :cond_28

    const/4 v11, 0x1

    goto :goto_29

    :cond_28
    const/4 v11, 0x0

    :goto_29
    and-int/lit8 v12, v9, 0x20

    if-eqz v12, :cond_2f

    const/4 v12, 0x1

    goto :goto_30

    :cond_2f
    const/4 v12, 0x0

    :goto_30
    and-int/lit8 v9, v9, 0x10

    if-eqz v9, :cond_36

    const/4 v9, 0x1

    goto :goto_37

    :cond_36
    const/4 v9, 0x0

    :goto_37
    if-eqz v11, :cond_40

    if-nez v9, :cond_40

    .line 165
    invoke-static/range {p0 .. p2}, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->AudioAttributesCompatParcelizer(Lo/AsPropertyTypeDeserializer;J)J

    move-result-wide v13

    goto :goto_45

    :cond_40
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    :goto_45
    if-nez v11, :cond_7b

    .line 168
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v1

    .line 169
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_51
    if-ge v4, v1, :cond_7a

    .line 171
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v18

    if-nez v9, :cond_60

    .line 174
    invoke-static/range {p0 .. p2}, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->AudioAttributesCompatParcelizer(Lo/AsPropertyTypeDeserializer;J)J

    move-result-wide v19

    move-wide/from16 v7, v19

    goto :goto_65

    :cond_60
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 180
    :goto_65
    new-instance v5, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;

    invoke-virtual {v0, v7, v8}, Lo/MinimalClassNameIdResolver;->write(J)J

    move-result-wide v21

    const/16 v23, 0x0

    move-object/from16 v17, v5

    move-wide/from16 v19, v7

    invoke-direct/range {v17 .. v23}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;-><init>(IJJB)V

    .line 176
    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_51

    :cond_7a
    move-object v1, v15

    :cond_7b
    if-eqz v12, :cond_a6

    .line 184
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v4

    int-to-long v4, v4

    const-wide/16 v7, 0x80

    and-long/2addr v7, v4

    const-wide/16 v17, 0x0

    cmp-long v7, v7, v17

    if-eqz v7, :cond_8e

    const/16 v16, 0x1

    goto :goto_90

    :cond_8e
    const/16 v16, 0x0

    .line 186
    :goto_90
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onMediaButtonEvent()J

    move-result-wide v7

    const-wide/16 v17, 0x1

    and-long v4, v4, v17

    const/16 v12, 0x20

    shl-long/2addr v4, v12

    or-long/2addr v4, v7

    const-wide/16 v7, 0x3e8

    mul-long/2addr v4, v7

    const-wide/16 v7, 0x5a

    .line 187
    div-long v7, v4, v7

    move/from16 v5, v16

    goto :goto_ac

    :cond_a6
    const/4 v5, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 189
    :goto_ac
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPrepare()I

    move-result v4

    .line 190
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v12

    .line 191
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v15

    move/from16 v16, v4

    move/from16 v24, v11

    move/from16 v17, v12

    move/from16 v18, v15

    move-object v12, v1

    move-wide/from16 v25, v13

    move v13, v5

    move-wide v14, v7

    move v7, v9

    move v5, v10

    move-wide/from16 v8, v25

    goto :goto_e0

    :cond_ca
    move-object v12, v1

    const/4 v5, 0x0

    const/4 v7, 0x0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, 0x0

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v24, 0x0

    .line 200
    :goto_e0
    new-instance v19, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;

    move-object/from16 v1, v19

    invoke-virtual {v0, v8, v9}, Lo/MinimalClassNameIdResolver;->write(J)J

    move-result-wide v10

    move v4, v6

    move/from16 v6, v24

    invoke-direct/range {v1 .. v18}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;-><init>(JZZZZJJLjava/util/List;ZJIII)V

    return-object v19
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .registers 4

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SCTE-35 SpliceInsertCommand { programSplicePts="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplApi26Parcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", programSplicePlaybackPositionUs= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatItemReceiver:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " }"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 247
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatSearchResultReceiver:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 248
    iget-boolean p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplBaseParcelizer:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 249
    iget-boolean p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplApi21Parcelizer:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 250
    iget-boolean p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatCustomActionResultReceiver:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 251
    iget-boolean p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaMetadataCompat:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 252
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesImplApi26Parcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 253
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaBrowserCompatItemReceiver:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 254
    iget-object p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesCompatParcelizer:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    .line 255
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    :goto_31
    if-ge v0, p2, :cond_41

    .line 257
    iget-object v1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->AudioAttributesCompatParcelizer:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;

    invoke-virtual {v1, p1}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_31

    .line 259
    :cond_41
    iget-boolean p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->read:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 260
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->IconCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 261
    iget p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->MediaDescriptionCompat:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 262
    iget p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->write:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 263
    iget p0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.AnonymousClass4 (androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$4)
.class final Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;
    .registers 3

    .line 271
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method

.method private static AudioAttributesCompatParcelizer(I)[Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;
    .registers 1

    .line 276
    new-array p0, p0, [Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 267
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$4;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 267
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$4;->AudioAttributesCompatParcelizer(I)[Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.IconCompatParcelizer (androidx.media3.extractor.metadata.scte35.SpliceInsertCommand$IconCompatParcelizer)
.class public final Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field public final AudioAttributesCompatParcelizer:J

.field public final RemoteActionCompatParcelizer:I

.field public final read:J


# direct methods
.method private constructor <init>(IJJ)V
    .registers 6

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 218
    iput p1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 219
    iput-wide p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;->AudioAttributesCompatParcelizer:J

    .line 220
    iput-wide p4, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;->read:J

    return-void
.end method

.method synthetic constructor <init>(IJJB)V
    .registers 7

    .line 210
    invoke-direct/range {p0 .. p5}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;-><init>(IJJ)V

    return-void
.end method

.method public static write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;
    .registers 8

    .line 230
    new-instance v6, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;-><init>(IJJ)V

    return-object v6
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/os/Parcel;)V
    .registers 4

    .line 224
    iget v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 225
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;->AudioAttributesCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 226
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceInsertCommand$IconCompatParcelizer;->read:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
