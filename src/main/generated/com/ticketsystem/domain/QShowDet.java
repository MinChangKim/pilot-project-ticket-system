package com.ticketsystem.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QShowDet is a Querydsl query type for ShowDet
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QShowDet extends EntityPathBase<ShowDet> {

    private static final long serialVersionUID = 174472114L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShowDet showDet = new QShowDet("showDet");

    public final NumberPath<Integer> inning = createNumber("inning", Integer.class);

    public final DateTimePath<java.util.Date> regDate = createDateTime("regDate", java.util.Date.class);

    public final StringPath regId = createString("regId");

    public final NumberPath<Integer> sellPrice = createNumber("sellPrice", Integer.class);

    public final QShow show;

    public final StringPath showCd = createString("showCd");

    public final StringPath showDate = createString("showDate");

    public final StringPath showDetCd = createString("showDetCd");

    public final NumberPath<Long> showDetSeq = createNumber("showDetSeq", Long.class);

    public final StringPath showTime = createString("showTime");

    public final NumberPath<Integer> ticketCnt = createNumber("ticketCnt", Integer.class);

    public final DateTimePath<java.util.Date> updateDate = createDateTime("updateDate", java.util.Date.class);

    public final StringPath updateId = createString("updateId");

    public QShowDet(String variable) {
        this(ShowDet.class, forVariable(variable), INITS);
    }

    public QShowDet(Path<? extends ShowDet> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QShowDet(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QShowDet(PathMetadata<?> metadata, PathInits inits) {
        this(ShowDet.class, metadata, inits);
    }

    public QShowDet(Class<? extends ShowDet> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.show = inits.isInitialized("show") ? new QShow(forProperty("show")) : null;
    }

}

